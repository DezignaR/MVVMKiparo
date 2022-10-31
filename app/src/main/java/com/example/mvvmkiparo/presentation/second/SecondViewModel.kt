package com.example.mvvmkiparo.presentation.second

import android.util.Log
import androidx.lifecycle.ViewModel

class SecondViewModel : ViewModel() {
    init {
        Log.e("ААА", "VM Second created")
    }

    override fun onCleared() {
        Log.e("AAA","VM Second Cleared")
        super.onCleared()
    }
}