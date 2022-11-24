package com.example.mvvmkiparo.di

import com.example.mvvmkiparo.data.database.GeneralDB
import com.example.mvvmkiparo.domain.usecase.DeleteUserUseCase
import com.example.mvvmkiparo.domain.usecase.GetAllUsersUseCase
import com.example.mvvmkiparo.domain.usecase.GetUserByIdUseCase
import com.example.mvvmkiparo.domain.usecase.InsertUserUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    fun provideDeleteUserUseCase(generalDB: GeneralDB): DeleteUserUseCase =
        DeleteUserUseCase(generalDB)

    @Provides
    fun provideGetAllUserUseCase(generalDB: GeneralDB): GetAllUsersUseCase =
        GetAllUsersUseCase(generalDB)

    @Provides
    fun provideGetUserByIdUseCase(generalDB: GeneralDB): GetUserByIdUseCase =
        GetUserByIdUseCase(generalDB)

    @Provides
    fun provideInsertUserUseCase(generalDB: GeneralDB): InsertUserUseCase =
        InsertUserUseCase(generalDB)
}