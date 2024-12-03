package com.app.dagger2examples.cheezecode.db

interface UserRepository {
    fun saveUser(email:String,password:String)
}