package com.example.mvvmkiparo.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@TypeConverters(DateConverter::class)
@Database(
    version = 1,
    entities = [Client::class,
        Service::class,
        PriceCondition::class,
        ServiceRendered::class
    ]
)
abstract class GeneralDB : RoomDatabase() {
    abstract fun generalDao(): GeneralDao
}
