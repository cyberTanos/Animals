package com.example.feature_home.data

import com.example.feature_home.data.response.CatResponse
import retrofit2.http.GET

interface CatApi {
    @GET("v1/images/search")
    suspend fun getImageCat(): List<CatResponse>
}
