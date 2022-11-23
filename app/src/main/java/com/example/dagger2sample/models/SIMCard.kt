package com.example.dagger2sample.models

import android.util.Log
import javax.inject.Inject

class SIMCard @Inject constructor(private val serviceProvider: ServiceProvider) {
    companion object{
        const val TAG = "SmartPhone"
    }

    init {
        Log.d(TAG, "SIM Card is inserted")
    }

    fun connectToService(){
        Log.d(TAG, "connectToService: connecting to available service")
        serviceProvider.getAvailableService()
    }

    fun callToPerson(){
        Log.d(TAG, "callToPerson: connecting to tower...")
        serviceProvider.makeCall()
    }
}