package com.example.mvvmkiparo.data.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(version = 1, entities = [UserEntity::class])
abstract class UserDB :RoomDatabase(){
abstract fun userDao(): UserDao
}
