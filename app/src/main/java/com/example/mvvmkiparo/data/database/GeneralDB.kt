package com.example.mvvmkiparo.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.mvvmkiparo.data.entity.ClientEntity
import com.example.mvvmkiparo.data.entity.PriceConditionEntity
import com.example.mvvmkiparo.data.entity.ServiceEntity
import com.example.mvvmkiparo.data.entity.ServiceRenderedEntity

@TypeConverters(DateConverter::class)
@Database(
    version = 1,
    entities = [ClientEntity::class,
        ServiceEntity::class,
        PriceConditionEntity::class,
        ServiceRenderedEntity::class
    ]
)
abstract class GeneralDB : RoomDatabase() {
    abstract fun generalDao(): GeneralDao
}
