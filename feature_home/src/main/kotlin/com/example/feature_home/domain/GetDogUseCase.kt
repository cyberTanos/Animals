package com.example.feature_home.domain

import com.example.feature_home.model.Dog
import javax.inject.Inject

class GetDogUseCaseImpl @Inject constructor(
    private val repo: DogRepository
) : GetDogUseCase {
    override suspend fun invoke(): Dog {
        return repo.getDogs().first()
    }
}

interface GetDogUseCase {
    suspend fun invoke(): Dog
}