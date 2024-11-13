package com.example.core.di

import dagger.Component
import javax.inject.Scope
import retrofit2.Retrofit

@CoreScope
@Component(
    modules = [
        RetrofitModule::class
    ]
)
interface CoreComponent {
    fun provideRetrofitBuilder(): Retrofit.Builder
}

@Scope
@Retention
annotation class CoreScope
