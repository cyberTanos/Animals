package com.example.feature_home.data

import com.example.feature_home.model.Cat
import com.example.feature_home.domain.CatRepository
import com.example.feature_home.domain.toDomain
import javax.inject.Inject

class CatRepositoryImpl @Inject constructor(
    private val catApi: CatApi
) : CatRepository {

    override suspend fun getCats(): List<Cat> {
        return catApi.getImageCat().map { it.toDomain() }
    }
}
