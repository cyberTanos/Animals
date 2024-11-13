package com.example.core.di

import com.example.core.data.CatApi
import com.example.core.data.CatRepositoryImpl
import com.example.core.domain.CatRepository
import dagger.Module
import dagger.Provides

@Module
class CatRepositoryModule {

    @Provides
    fun provideRepository(catApi: CatApi): CatRepository = CatRepositoryImpl(catApi)
}
