package com.example.mvvmkiparo.domain

import android.content.Context
import androidx.room.Room
import com.example.mvvmkiparo.repository.UserDB
import com.example.mvvmkiparo.repository.UserEntity

class InsertUserUseCase(context: Context) {

    private val userDB = Room.databaseBuilder(context,UserDB::class.java,"userDB").build()
    val userDAO = userDB.userDao()


}