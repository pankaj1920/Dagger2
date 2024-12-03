package com.app.dagger2examples.cheezecode

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.dagger2examples.R
import com.app.dagger2examples.cheezecode.db.UserRegistrationService
import com.app.dagger2examples.cheezecode.message.EmailService
import javax.inject.Inject

class CheezyCodeDagerActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cheezy_code_dager)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


       /* val component = DaggerUserRegistrationComponent.builder().notificationServiceModule(
            NotificationServiceModule(5)
        ).build()*/

        val component = DaggerUserRegistrationComponent.factory().create(5)

        component.inject(this)
//        val userRegistrationService = component.getUserRegistrationService()
//        val emailService = component.getEmailService()
        userRegistrationService.registerUser("psb@gmail.com", "123")
    }
}