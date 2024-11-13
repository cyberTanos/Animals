package com.example.feature_home.domain

import com.example.feature_home.model.Cat
import com.example.feature_home.model.Dog

fun com.example.feature_home.data.response.CatResponse.toDomain(): Cat {
    return Cat(id = this.id.orEmpty(), image = this.image.orEmpty())
}

fun com.example.feature_home.data.response.DogResponse.toDomain(): Dog {
    return Dog(id = this.id.orEmpty(), image = this.image.orEmpty())
}
