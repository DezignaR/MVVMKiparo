package com.example.mvvmkiparo.domain.usecase

import com.example.mvvmkiparo.data.entity.ClientEntity
import com.example.mvvmkiparo.data.database.GeneralDB
import javax.inject.Inject

class GetAllUsersUseCase @Inject constructor(
    private val generalDB: GeneralDB
) {
    fun execute(): List<ClientEntity> {
        return generalDB.generalDao().getClientAll()
    }
}