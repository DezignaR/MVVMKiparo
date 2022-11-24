package com.example.mvvmkiparo.di

import android.content.Context
import androidx.room.Room
import com.example.mvvmkiparo.data.database.GeneralDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    @Singleton
    fun provideGeneralDB(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, GeneralDB::class.java, "generalDB")
            .build()
}