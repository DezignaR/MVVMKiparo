package com.example.mvvmkiparo.presentation.main

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor():ViewModel() {

    init {
        Log.e("ААА", "VM Main created")
    }

    override fun onCleared() {
        Log.e("AAA","VM Main Cleared")
        super.onCleared()
    }





}