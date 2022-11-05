package com.example.mvvmkiparo.domain

import android.content.Context
import androidx.room.Room
import com.example.mvvmkiparo.data.database.GeneralDB
import com.example.mvvmkiparo.data.database.Client

class DeleteUserUseCase(context: Context) {
    private val generalDB = Room.databaseBuilder(context, GeneralDB::class.java,"generalDB").build()
    private val userDAO = generalDB.generalDao()

    fun deleteUser(client: Client) {
        userDAO.deleteClient(client)
    }
}