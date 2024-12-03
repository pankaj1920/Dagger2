package com.app.dagger2examples.cheezecode

interface UserRepository {
    fun saveUser(email:String,password:String)
}