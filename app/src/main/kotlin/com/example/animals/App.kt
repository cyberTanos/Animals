package com.example.animals

import android.app.Application
import com.example.core.di.CoreComponent
import com.example.core.di.CoreProvider
import com.example.core.di.DaggerCoreComponent

class App : Application(), CoreProvider {

    override fun getCoreComponent(): CoreComponent {
        return DaggerCoreComponent.create()
    }
}
