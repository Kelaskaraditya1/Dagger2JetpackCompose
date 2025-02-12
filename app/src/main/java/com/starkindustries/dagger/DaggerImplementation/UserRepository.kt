package com.starkindustries.dagger.DaggerImplementation

import android.util.Log
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email:String,password: String)
}

class SqlRepository @Inject constructor():UserRepository{

    override fun saveUser(email:String,password:String){
        Log.d("UserRepo","User with ${email} Registered Successfully to Sql Repository!!")
    }
}

class FirebaseRepository @Inject constructor():UserRepository{
    override fun saveUser(email:String,password:String){
        Log.d("UserRepo","User with ${email} Registered Successfully to Firebase Repository!!")
    }

}