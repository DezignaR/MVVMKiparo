package com.example.mvvmkiparo.domain

import android.content.Context
import androidx.room.Room
import com.example.mvvmkiparo.data.database.UserDB
import com.example.mvvmkiparo.data.database.UserEntity

class GetUserByIdUseCase(context: Context) {
    private val userDB = Room.databaseBuilder(context, UserDB::class.java,"userDB").build()
    private val userDAO = userDB.userDao()

    fun getUserById(userID: Int): UserEntity {
        return userDAO.getUserById(userID)
    }
}