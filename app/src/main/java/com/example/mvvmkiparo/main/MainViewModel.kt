package com.example.mvvmkiparo.main

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {

    init {
        Log.e("ААА", "VM createt")
    }

    override fun onCleared() {
        Log.e("AAA","VM Cleared")
        super.onCleared()
    }





}