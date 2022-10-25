package com.example.mvvmkiparo.repository

import androidx.room.Database

@Database(version = 1, entities = [UserEntity::class])
abstract class UserDB {
}