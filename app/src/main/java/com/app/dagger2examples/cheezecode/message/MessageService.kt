package com.app.dagger2examples.cheezecode.message

import android.util.Log

/*class EmailService @Inject constructor() {

    fun send(to: String, from: String, body: String) {
        Log.d("TAG", "Email Sent")
    }
}*/
class MessageService (private val retryCount:Int) : NotificationService {

    override  fun send(to: String, from: String, body: String) {
        Log.d("TAG", "Message Sent count $retryCount")
    }
}