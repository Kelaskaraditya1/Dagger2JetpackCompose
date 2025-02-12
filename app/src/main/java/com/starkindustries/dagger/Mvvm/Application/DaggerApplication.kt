package com.starkindustries.dagger.Mvvm.Application

import android.app.Application
import com.starkindustries.dagger.Mvvm.Component.ApplicationComponent
import com.starkindustries.dagger.Mvvm.Component.DaggerApplicationComponent
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class DaggerApplication:Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.builder().build()
    }
}