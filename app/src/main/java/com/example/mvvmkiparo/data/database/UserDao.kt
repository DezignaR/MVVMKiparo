package com.example.mvvmkiparo.data.database

import androidx.room.*

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(userEntity: UserEntity)
    @Delete
    fun deleteUser(userEntity: UserEntity)
    @Update
    fun updateUser(userEntity: UserEntity)
    @Query("SELECT * FROM users WHERE id = :id")
    fun getUserById(id:Int): UserEntity
    @Query("SELECT * FROM users")
    fun getAll():List<UserEntity>
}