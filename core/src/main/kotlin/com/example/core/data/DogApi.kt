package com.example.core.data

import com.example.core.data.response.DogResponse
import retrofit2.http.GET

interface DogApi {
    @GET("v1/images/search")
    suspend fun getDogs(): List<DogResponse>
}
