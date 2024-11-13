package com.example.feature_home.di

import com.example.feature_home.data.CatApi
import com.example.feature_home.data.DogApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

private const val BASE_UR_CAT = "https://api.thecatapi.com/"
private const val BASE_URL_DOG = "https://api.thedogapi.com/"

@Module
class ApiModule {

    @Provides
    @FeatureScope
    fun providesDogApi(retrofitBuilder: Retrofit.Builder): DogApi {
        val retrofit = retrofitBuilder.baseUrl(BASE_URL_DOG).build()
        return retrofit.create(DogApi::class.java)
    }

    @Provides
    @FeatureScope
    fun providesCatApi(retrofitBuilder: Retrofit.Builder): CatApi {
        val retrofit = retrofitBuilder.baseUrl(BASE_UR_CAT).build()
        return retrofit.create(CatApi::class.java)
    }
}
