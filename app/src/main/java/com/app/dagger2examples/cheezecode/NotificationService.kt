package com.app.dagger2examples.cheezecode

interface NotificationService {
    fun send(to:String,from:String,body:String)
}