package com.example.dagger2sample.models

import android.util.Log
import javax.inject.Inject

class CanonCamera @Inject constructor() : Camera {
    companion object{
        const val TAG = "SmartPhone"
    }

    init {
        Log.d(TAG, "CanonCamera: Hardware detected and drivers installed")
    }

    override fun getBackCamera() {
        Log.d(TAG, "getBackCamera: Showing Room")
    }

    override fun getFrontCamera() {
        Log.d(TAG, "getFrontCamera: Showing face")
    }
}