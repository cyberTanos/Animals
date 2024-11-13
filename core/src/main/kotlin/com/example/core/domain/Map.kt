package com.example.core.domain

import com.example.core.data.response.CatResponse
import com.example.core.data.response.DogResponse
import com.example.core.model.Cat
import com.example.core.model.Dog

fun CatResponse.toDomain(): Cat {
    return Cat(id = this.id.orEmpty(), image = this.image.orEmpty())
}

fun DogResponse.toDomain(): Dog {
    return Dog(id = this.id.orEmpty(), image = this.image.orEmpty())
}
