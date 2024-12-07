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
        // test - 1
        // test - 2
        // test - 3
    }

    override fun getCoreComponent(): CoreComponent {
        return coreComponent
    }
}
