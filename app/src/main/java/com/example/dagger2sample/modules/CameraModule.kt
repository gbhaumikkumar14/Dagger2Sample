package com.example.dagger2sample.modules

import com.example.dagger2sample.models.Camera
import com.example.dagger2sample.models.CanonCamera
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class CameraModule {

    @Binds
    abstract fun bindsCamera(canonCamera: CanonCamera): Camera
}
