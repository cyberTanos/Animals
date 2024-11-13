package com.example.feature_home.di

import com.example.core.di.CoreComponent
import com.example.feature_home.screen.MainFragment
import dagger.Component
import javax.inject.Scope

@FeatureScope
@Component(
    modules = [
        /*CatRepositoryModule::class,
        DogRepositoryModule::class,*/
        ViewModelModule::class],
    dependencies = [
        CoreComponent::class
    ]
)
interface FeatureComponent {

    fun inject(fragment: MainFragment)

    @Component.Factory
    interface Factory {
        fun create(
            coreComponent: CoreComponent
        ): FeatureComponent
    }
}

@Scope
@Retention
annotation class FeatureScope
