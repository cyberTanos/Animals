package com.example.core.data

import com.example.core.domain.DogRepository
import com.example.core.domain.toDomain
import com.example.core.model.Dog
import javax.inject.Inject

class DogRepositoryImpl @Inject constructor(
    private val dogApi: DogApi
) : DogRepository {

    override suspend fun getDogs(): List<Dog> {
        return dogApi.getDogs().map { it.toDomain() }
    }
}
