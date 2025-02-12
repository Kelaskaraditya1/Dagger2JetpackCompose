package com.starkindustries.dagger.Mvvm.Component

import com.starkindustries.dagger.Mvvm.Di.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {

}