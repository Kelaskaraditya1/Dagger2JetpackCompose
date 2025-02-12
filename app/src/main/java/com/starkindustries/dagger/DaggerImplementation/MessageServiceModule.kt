package com.starkindustries.dagger.DaggerImplementation

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class MessageServiceModule {

    @Provides
    fun getMessageService():NotificationService{
        return MessageService()
    }
}