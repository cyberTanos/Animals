package com.example.core.di

import com.example.core.data.DogApi
import com.example.core.data.DogRepositoryImpl
import com.example.core.domain.DogRepository
import dagger.Module
import dagger.Provides

@Module
class DogRepositoryModule {

    @Provides
    fun provideRepository(dogApi: DogApi): DogRepository = DogRepositoryImpl(dogApi)
}
