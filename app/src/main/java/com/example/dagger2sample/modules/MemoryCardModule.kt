package com.example.dagger2sample.modules

import android.util.Log
import com.example.dagger2sample.models.MemoryCard
import dagger.Module
import dagger.Provides

// Module with some state
@Module
class MemoryCardModule(val memorySize: Int) {
    companion object{
        const val TAG = "SmartPhone"
    }
    @Provides
    fun provideMemoryCard(): MemoryCard{
        Log.d(TAG, "provideMemoryCard: with Size of $memorySize")
        return MemoryCard(memorySize)
    }
}