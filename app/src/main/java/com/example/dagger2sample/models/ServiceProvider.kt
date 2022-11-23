package com.example.dagger2sample.models

import android.util.Log
import javax.inject.Inject

class ServiceProvider @Inject constructor() {
    companion object{
        const val TAG = "SmartPhone"
    }
    init{
        Log.d(TAG, "Service Provider Created")
    }

    fun getAvailableService(){
        Log.d(TAG, "getAvailableService: Airtel is connected")
    }

    fun makeCall(){
        Log.d(TAG, "makeCall: Ringing...")
    }
}