package com.example.mvvmkiparo.general

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class GeneralViewModel : ViewModel() {
    init {
        Log.e("ААА", "VM General created")
    }

    val resultLive = MutableLiveData<String>()

    fun setNext(){
       val params = "Next"
       resultLive.value = params
    }

    fun setBack(){
        val params = "Back"
        resultLive.value = params
    }

    override fun onCleared() {
        Log.e("AAA","VM General Cleared")
        super.onCleared()
    }
}