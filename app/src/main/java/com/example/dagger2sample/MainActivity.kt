package com.example.dagger2sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2sample.models.SmartPhone
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    // Field Injection
    @Inject
    lateinit var smartPhone : SmartPhone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as CustomApplication).smartPhoneComponent
            .inject(this)
        smartPhone.startPhone()
        smartPhone.makeCallWithRecording()
    }
}