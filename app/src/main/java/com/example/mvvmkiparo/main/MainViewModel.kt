package com.example.mvvmkiparo.main

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {

    init {
        Log.e("ААА", "VM Main created")
    }

    override fun onCleared() {
        Log.e("AAA","VM Main Cleared")
        super.onCleared()
    }





}