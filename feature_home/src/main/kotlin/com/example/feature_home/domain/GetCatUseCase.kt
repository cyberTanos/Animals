package com.example.feature_home.domain

import com.example.feature_home.model.Cat
import javax.inject.Inject

class GetCatUseCaseImpl @Inject constructor(
    private val repo: CatRepository
) : GetCatUseCase {
    override suspend fun invoke(): Cat {
        return repo.getCats().first()
    }
}

interface GetCatUseCase {
    suspend fun invoke(): Cat
}