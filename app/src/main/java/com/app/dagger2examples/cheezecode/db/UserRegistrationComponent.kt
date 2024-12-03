package com.app.dagger2examples.cheezecode.db

import com.app.dagger2examples.cheezecode.CheezyCodeDagerActivity
import com.app.dagger2examples.cheezecode.message.NotificationServiceModule
import dagger.BindsInstance
import dagger.Component


@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    //    fun getUserRegistrationService(): UserRegistrationService
//    fun getEmailService():EmailService
    fun inject(cheezyCodeDagerActivity: CheezyCodeDagerActivity)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance retryCount: Int): UserRegistrationComponent


    }
}