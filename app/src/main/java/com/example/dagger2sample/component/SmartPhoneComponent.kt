package com.example.dagger2sample.component

import com.example.dagger2sample.MainActivity
import com.example.dagger2sample.models.SmartPhone
import com.example.dagger2sample.modules.CameraModule
import com.example.dagger2sample.modules.MemoryCardModule
import dagger.Component
import javax.inject.Singleton

// Declaring component also Singleton as we declared smartphone
@Singleton
@Component(modules = [MemoryCardModule::class, CameraModule::class])
interface SmartPhoneComponent {
    // Where ever we need smartphone object we can add those activities and fragments here
    fun inject(mainActivity: MainActivity)
}