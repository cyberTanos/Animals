package com.example.feature_home.data

import com.example.feature_home.data.response.DogResponse
import retrofit2.http.GET

interface DogApi {
    @GET("v1/images/search")
    suspend fun getDogs(): List<DogResponse>
}
