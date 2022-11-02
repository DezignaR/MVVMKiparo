package com.example.mvvmkiparo.di

import android.content.Context
import com.example.mvvmkiparo.domain.DeleteUserUseCase
import com.example.mvvmkiparo.domain.GetAllUsersUseCase
import com.example.mvvmkiparo.domain.GetUserByIdUseCase
import com.example.mvvmkiparo.domain.InsertUserUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    fun provideDeleteUserUseCase(@ApplicationContext context: Context): DeleteUserUseCase {
        return DeleteUserUseCase(context = context)
    }
    @Provides
    fun provideGetAllUserUseCase(@ApplicationContext context: Context): GetAllUsersUseCase {
        return GetAllUsersUseCase(context = context)
    }

    @Provides
    fun provideGetUserByIdUseCase(@ApplicationContext context: Context): GetUserByIdUseCase {
        return GetUserByIdUseCase(context = context)
    }

    @Provides
    fun provideInsertUserUseCase(@ApplicationContext context: Context): InsertUserUseCase {
        return InsertUserUseCase(context = context)
    }
}