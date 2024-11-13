package com.example.core.domain

import com.example.core.model.Dog

interface DogRepository {
    suspend fun getDogs(): List<Dog>
}
