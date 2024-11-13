package com.example.feature_home.data

import com.example.feature_home.model.Dog
import com.example.feature_home.domain.DogRepository
import com.example.feature_home.domain.toDomain
import javax.inject.Inject

class DogRepositoryImpl @Inject constructor(
    private val dogApi: DogApi
) : DogRepository {

    override suspend fun getDogs(): List<Dog> {
        return dogApi.getDogs().map { it.toDomain() }
    }
}
