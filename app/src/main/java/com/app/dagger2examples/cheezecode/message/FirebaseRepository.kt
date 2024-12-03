package com.app.dagger2examples.cheezecode.message

import android.util.Log
import com.app.dagger2examples.cheezecode.db.UserRepository
import javax.inject.Inject

class FirebaseRepository @Inject constructor() : UserRepository {
    override fun saveUser(email:String,password:String){
        Log.d("TAG","User saved in Firebase DB")
    }
}