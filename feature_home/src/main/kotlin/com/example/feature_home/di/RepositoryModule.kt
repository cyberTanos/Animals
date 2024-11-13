package com.example.feature_home.di

import com.example.feature_home.data.CatRepositoryImpl
import com.example.feature_home.data.DogRepositoryImpl
import com.example.feature_home.domain.CatRepository
import com.example.feature_home.domain.DogRepository
import dagger.Binds
import dagger.Module

@Module
interface RepositoryModule {

    @Binds
    fun bindCatRepository(impl: CatRepositoryImpl): CatRepository

    @Binds
    fun bindDogRepository(impl: DogRepositoryImpl): DogRepository
}
