package com.example.feature_home.domain

import com.example.feature_home.model.Cat

interface CatRepository {
   suspend fun getCats(): List<Cat>
}
