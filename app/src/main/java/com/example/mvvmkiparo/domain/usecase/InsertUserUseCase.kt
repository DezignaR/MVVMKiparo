package com.example.mvvmkiparo.domain.usecase

import com.example.mvvmkiparo.data.entity.ClientEntity
import com.example.mvvmkiparo.data.database.GeneralDB
import javax.inject.Inject

class InsertUserUseCase @Inject constructor(
    private val generalDB: GeneralDB
) {
    fun execute(clientEntity: ClientEntity) {
        generalDB.generalDao().insertClient(clientEntity)
    }
}