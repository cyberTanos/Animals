package com.example.core.data

import com.example.core.data.response.CatResponse
import retrofit2.http.GET

interface CatApi {
    @GET("v1/images/search")
    suspend fun getImageCat(): List<CatResponse>
}
