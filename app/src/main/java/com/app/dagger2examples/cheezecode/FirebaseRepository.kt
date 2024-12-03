package com.app.dagger2examples.cheezecode

import android.util.Log
import javax.inject.Inject

class FirebaseRepository @Inject constructor() :UserRepository {
    override fun saveUser(email:String,password:String){
        Log.d("TAG","User saved in Firebase DB")
    }
}