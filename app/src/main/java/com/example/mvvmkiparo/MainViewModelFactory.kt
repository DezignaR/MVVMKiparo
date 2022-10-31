package com.example.mvvmkiparo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmkiparo.presentation.main.MainViewModel

class MainViewModelFactory : ViewModelProvider.Factory {



    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel() as T
    }

}