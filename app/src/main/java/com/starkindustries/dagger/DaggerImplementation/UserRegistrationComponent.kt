package com.starkindustries.dagger.DaggerImplementation

import dagger.Component

@Component(modules = [FirebaseRepositoryModule::class,MessageServiceModule::class])
interface UserRegistrationComponent {

    fun getUserRegistrationService():UserRegistrationService

    fun getEmailService():EmailService

    fun getUserRepository():SqlRepository
}