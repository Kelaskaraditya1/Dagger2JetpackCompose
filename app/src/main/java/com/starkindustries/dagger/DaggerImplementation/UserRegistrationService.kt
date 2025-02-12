package com.starkindustries.dagger.DaggerImplementation

import javax.inject.Inject

class UserRegistrationService @Inject constructor(private val userRepository: UserRepository,private val emailService: NotificationService) {

    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        emailService.send(email,"kelaskaraditya1@gmail.com","I am Ironman")
    }
}