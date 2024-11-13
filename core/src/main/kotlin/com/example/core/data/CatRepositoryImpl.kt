package com.example.core.data

import com.example.core.model.Cat
import com.example.core.domain.CatRepository
import com.example.core.domain.toDomain
import javax.inject.Inject

class CatRepositoryImpl @Inject constructor(
    private val catApi: CatApi
) : CatRepository {

    override suspend fun getCats(): List<Cat> {
        return catApi.getImageCat().map { it.toDomain() }
    }
}
