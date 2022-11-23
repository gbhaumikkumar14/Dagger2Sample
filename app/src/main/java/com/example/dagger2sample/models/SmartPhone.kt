package com.example.dagger2sample.models

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

// Declaring singleton as we do not want all smart phone components to be created everytime
@Singleton
class SmartPhone @Inject constructor(
    private val battery: Battery,
    private val memoryCard: MemoryCard,
    private val simCard: SIMCard,
    private val camera: Camera
) {

    companion object{
        const val TAG = "SmartPhone"
    }
    init{
        Log.d(TAG, "SmartPhone is switched on")
    }

    fun startPhone(){
        Log.d(TAG, "startPhone: Starting...")
        battery.checkBatteryPercentage()
        memoryCard.checkForSpace()
        simCard.connectToService()
    }

    fun makeCallWithRecording(){
        Log.d(TAG, "makeCallWithRecording: Making call to person...")
        camera.getFrontCamera()
        simCard.callToPerson()
    }
}