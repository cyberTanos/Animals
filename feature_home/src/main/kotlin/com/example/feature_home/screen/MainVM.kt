package com.example.feature_home.screen

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.feature_home.domain.GetCatUseCase
import com.example.feature_home.domain.GetDogUseCase
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import javax.inject.Provider
import kotlinx.coroutines.launch

class MainVM @AssistedInject constructor(
    @Assisted private val id: Int,
    private val getCatUseCase: GetCatUseCase,
    private val getDogUseCase: GetDogUseCase
) : ViewModel() {

    private val _cat = MutableLiveData<String>()
    val cat: LiveData<String> get() = _cat

    private val _dog = MutableLiveData<String>()
    val dog: LiveData<String> get() = _dog

    fun getCat() {
        viewModelScope.launch {
            Log.d("getCatTAG", "getCat: $id")
            _cat.value = getCatUseCase.invoke().image
        }
    }

    fun getDog() {
        viewModelScope.launch {
            _dog.value = getDogUseCase.invoke().image
        }
    }

    @AssistedFactory
    interface Factory {
        fun create(id: Int): MainVM
    }

    class MainVMFactory @AssistedInject constructor(
        @Assisted private val id: Int,
        private val provider: Provider<MainVM.Factory>
    ) : ViewModelProvider.Factory {
        @AssistedFactory
        interface Factory {
            fun getID(id: Int): MainVMFactory
        }

        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return when (modelClass) {
                MainVM::class.java -> provider.get()
                    .create(id)

                else -> throw IllegalArgumentException(
                    "Create ViewModel Error for ${modelClass.name}."
                )
            } as T
        }
    }
}
