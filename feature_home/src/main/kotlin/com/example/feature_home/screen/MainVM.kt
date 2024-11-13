package com.example.feature_home.screen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.feature_home.domain.GetCatUseCase
import com.example.feature_home.domain.GetDogUseCase
import javax.inject.Inject
import kotlinx.coroutines.launch

class MainVM @Inject constructor(
    private val getCatUseCase: GetCatUseCase,
    private val getDogUseCase: GetDogUseCase
) : ViewModel() {

    private val _cat = MutableLiveData<String>()
    val cat: LiveData<String> get() = _cat

    private val _dog = MutableLiveData<String>()
    val dog: LiveData<String> get() = _dog

    fun getCat() {
        viewModelScope.launch {
            _cat.value = getCatUseCase.invoke().image
        }
    }

    fun getDog() {
        viewModelScope.launch {
            _dog.value = getDogUseCase.invoke().image
        }
    }
}
