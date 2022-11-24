package com.example.mvvmkiparo.presentation.second

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SecondViewModel @Inject constructor(): ViewModel() {
    init {
        Log.e("ААА", "VM Second created")
    }

    override fun onCleared() {
        Log.e("AAA","VM Second Cleared")
        super.onCleared()
    }
}