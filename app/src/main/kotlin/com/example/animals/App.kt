package com.example.animals

import android.app.Application
import com.example.core.di.CoreComponent
import com.example.core.di.CoreProvider
import com.example.core.di.DaggerCoreComponent

class App : Application(), CoreProvider {

    private lateinit var coreComponent: CoreComponent

    override fun onCreate() {
        super.onCreate()
        coreComponent = DaggerCoreComponent.create()
    }

    override fun getCoreComponent(): CoreComponent {
        return coreComponent
    }
}
