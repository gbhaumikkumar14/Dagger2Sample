package com.example.dagger2sample

import android.app.Application
import com.example.dagger2sample.component.DaggerSmartPhoneComponent
import com.example.dagger2sample.component.SmartPhoneComponent
import com.example.dagger2sample.modules.MemoryCardModule

class CustomApplication : Application() {
    lateinit var smartPhoneComponent: SmartPhoneComponent
    override fun onCreate() {
        smartPhoneComponent = initDagger()
        super.onCreate()
    }

    private fun initDagger(): SmartPhoneComponent{
        // use builder when modules with state
        return DaggerSmartPhoneComponent.builder()
            .memoryCardModule(MemoryCardModule(4096))
            .build()
    }
}