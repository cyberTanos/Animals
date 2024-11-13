package com.example.feature_home.screen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.domain.CatRepository
import com.example.core.domain.DogRepository
import javax.inject.Inject
import kotlinx.coroutines.launch

class MainVM @Inject constructor(
    private val catRepository: CatRepository,
    private val dogRepository: DogRepository
) : ViewModel() {

    private val _cat = MutableLiveData<String>()
    val cat: LiveData<String> get() = _cat

    private val _dog = MutableLiveData<String>()
    val dog: LiveData<String> get() = _dog

    fun getCat() {
        viewModelScope.launch {
            _cat.value = catRepository.getCats().first().image
        }
    }

    fun getDog() {
        viewModelScope.launch {
            _dog.value = dogRepository.getDogs().first().image
        }
    }
}
