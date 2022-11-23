package com.example.dagger2sample.models

import android.util.Log

/**
 * Assuming that memory card is part of third party dependency and we does not have
 * access to modify constructor
 */
class MemoryCard(val memorySize: Int){
    companion object{
        const val TAG = "SmartPhone"
    }
    init{
        Log.d(TAG, "Memory card inserted of size $memorySize")
    }

    fun checkForSpace(){
        Log.d(TAG, "checkForSpace: Space Available")
    }
}