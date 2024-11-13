package com.example.core.domain

import com.example.core.model.Cat

interface CatRepository {
   suspend fun getCats(): List<Cat>
}
