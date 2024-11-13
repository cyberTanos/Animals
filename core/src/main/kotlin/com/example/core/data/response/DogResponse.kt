package com.example.core.data.response

import com.google.gson.annotations.SerializedName

data class DogResponse(
    @SerializedName("id") val id: String?,
    @SerializedName("url") val image: String?
)
