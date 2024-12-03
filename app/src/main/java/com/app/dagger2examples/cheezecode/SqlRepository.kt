package com.app.dagger2examples.cheezecode

import android.util.Log
import javax.inject.Inject

class SqlRepository @Inject constructor() :UserRepository {
    override fun saveUser(email:String,password:String){
        Log.d("TAG","User saved in Sql DB")
    }
}