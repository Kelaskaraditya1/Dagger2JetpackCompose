package com.starkindustries.dagger.Frontend.Activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.starkindustries.dagger.DaggerImplementation.DaggerUserRegistrationComponent
import com.starkindustries.dagger.DaggerImplementation.UserRegistrationService
import com.starkindustries.dagger.ui.theme.DaggerTheme
import dagger.hilt.EntryPoint

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DaggerTheme {
                Application()
            }
        }
    }
}

@Composable
fun Application(){
    var component = DaggerUserRegistrationComponent.builder().build()
    var userRegistrationService = component.getUserRegistrationService()
    userRegistrationService.registerUser(email = "kelaskaraditya1@gmail.com",password = "Aditya@1234")

//    var emailService = component.getEmailService()
//    emailService.send("kelaskaraditya1@gmail.com","pbatemen003@gmail.com","I am Ironman")
//
//    var userRepository = component.getUserRepository()
//    userRepository.saveUser("kelaskaraditya1@gmail.com","Aditya@1234")
}

