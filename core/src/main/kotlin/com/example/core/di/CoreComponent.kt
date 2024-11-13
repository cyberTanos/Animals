package com.example.core.di

import com.example.core.domain.CatRepository
import com.example.core.domain.DogRepository
import dagger.Component
import javax.inject.Scope

@CoreScope
@Component(
    modules = [
        CatRetrofitModule::class,
        DogRetrofitModule::class,
        CatRepositoryModule::class,
        DogRepositoryModule::class
    ]
)
interface CoreComponent {
    /*val catApi: CatApi
    val dogApi: DogApi*/
    fun provideCatRepository(): CatRepository
    fun provideDogRepository(): DogRepository
}

@Scope
@Retention
annotation class CoreScope
