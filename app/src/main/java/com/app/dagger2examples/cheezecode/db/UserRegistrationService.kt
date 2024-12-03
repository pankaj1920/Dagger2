package com.app.dagger2examples.cheezecode.db

import com.app.dagger2examples.cheezecode.message.MessageQualifier
import com.app.dagger2examples.cheezecode.message.NotificationService
import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    @MessageQualifier
    private val notificationService: NotificationService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "psb@gmail.com", "User Registered")
    }
}