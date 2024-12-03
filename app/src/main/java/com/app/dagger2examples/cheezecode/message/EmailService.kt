package com.app.dagger2examples.cheezecode.message

import android.util.Log
import javax.inject.Inject

/*class EmailService @Inject constructor() {

    fun send(to: String, from: String, body: String) {
        Log.d("TAG", "Email Sent")
    }
}*/
class EmailService @Inject constructor() : NotificationService {

    override  fun send(to: String, from: String, body: String) {
        Log.d("TAG", "Email Sent")
    }
}