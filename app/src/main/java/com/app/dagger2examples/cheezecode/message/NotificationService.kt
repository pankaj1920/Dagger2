package com.app.dagger2examples.cheezecode.message

interface NotificationService {
    fun send(to:String,from:String,body:String)
}