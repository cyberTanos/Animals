package com.example.feature_home.domain

import com.example.feature_home.model.Dog

interface DogRepository {
    suspend fun getDogs(): List<Dog>
}
