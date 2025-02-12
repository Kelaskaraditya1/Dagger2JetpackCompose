package com.starkindustries.dagger.DaggerImplementation

import android.util.Log
import javax.inject.Inject

interface NotificationService{
    fun send(from:String,to:String,body:String)
}

class EmailService @Inject constructor():NotificationService{

    override fun send(from:String,to:String,body:String){
        Log.d("EmailSent","Email sent to ${to} Successfully!!")
    }

}

class MessageService @Inject constructor():NotificationService{
    override fun send(from: String, to: String, body: String) {
        Log.d("MessageSent","Message sent to ${to} Successfully!!")
    }

}