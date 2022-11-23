package com.example.dagger2sample.models

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor(){
    companion object{
        const val TAG = "SmartPhone"
    }
    init{
        Log.d(TAG, "Battery inserted to phone")
    }

    fun checkBatteryPercentage(){
        Log.d(TAG, "checkBatteryPercentage: Battery Level 80%")
    }
}