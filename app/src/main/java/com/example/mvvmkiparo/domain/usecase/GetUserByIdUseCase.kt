package com.example.mvvmkiparo.domain.usecase

import com.example.mvvmkiparo.data.entity.ClientEntity
import com.example.mvvmkiparo.data.database.GeneralDB
import javax.inject.Inject

class GetUserByIdUseCase @Inject constructor(
    private val generalDB: GeneralDB
) {
    fun execute(userID: Int): ClientEntity {
        return generalDB.generalDao().getClientById(userID)
    }
}