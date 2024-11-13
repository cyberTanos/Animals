package com.example.feature_home.di

import com.example.feature_home.domain.GetCatUseCase
import com.example.feature_home.domain.GetCatUseCaseImpl
import com.example.feature_home.domain.GetDogUseCase
import com.example.feature_home.domain.GetDogUseCaseImpl
import dagger.Binds
import dagger.Module

@Module
interface UseCaseModule {

    @Binds
    fun bindCatUseCase(impl: GetCatUseCaseImpl): GetCatUseCase

    @Binds
    fun bindDogUseCase(impl: GetDogUseCaseImpl): GetDogUseCase
}