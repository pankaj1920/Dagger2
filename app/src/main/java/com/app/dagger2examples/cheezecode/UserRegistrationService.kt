package com.app.dagger2examples.cheezecode

import javax.inject.Inject
import javax.inject.Named

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