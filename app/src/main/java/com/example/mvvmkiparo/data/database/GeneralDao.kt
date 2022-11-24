package com.example.mvvmkiparo.data.database

import androidx.room.*
import com.example.mvvmkiparo.data.entity.ClientEntity
import com.example.mvvmkiparo.data.entity.PriceConditionEntity
import com.example.mvvmkiparo.data.entity.ServiceEntity
import com.example.mvvmkiparo.data.entity.ServiceRenderedEntity
import java.util.*

@Dao
interface GeneralDao {
    //Client
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertClient(clientEntity: ClientEntity)
    @Delete
    fun deleteClient(clientEntity: ClientEntity)
    @Update
    fun updateClient(clientEntity: ClientEntity)
    @Query("SELECT * FROM client WHERE id_client = :id_client")
    fun getClientById(id_client:Int): ClientEntity
    @Query("SELECT * FROM client")
    fun getClientAll():List<ClientEntity>

    //Service
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertService(serviceEntity: ServiceEntity)
    @Delete
    fun deleteService(serviceEntity: ServiceEntity)
    @Update
    fun updateService(serviceEntity: ServiceEntity)
    @Query("SELECT * FROM service WHERE id_service = :id_service")
    fun getServiceById(id_service:Int): ServiceEntity
    @Query("SELECT * FROM service")
    fun getServiceAll():List<ServiceEntity>

    //PriceCondition
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPriceCondition(priceConditionEntity: PriceConditionEntity)
    @Delete
    fun deletePriceCondition(priceConditionEntity: PriceConditionEntity)
    @Update
    fun updatePriceCondition(priceConditionEntity: PriceConditionEntity)
    @Query("SELECT * FROM priceCondition WHERE id_priceCondition = :id_priceCondition")
    fun getPriceConditionById(id_priceCondition:Int): PriceConditionEntity
    @Query("SELECT * FROM priceCondition")
    fun getPriceConditionAll():List<PriceConditionEntity>

    //ServiceRendered
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertServiceRendered(serviceRenderedEntity: ServiceRenderedEntity)
    @Delete
    fun deleteServiceRendered(serviceRenderedEntity: ServiceRenderedEntity)
    @Update
    fun updateServiceRendered(serviceRenderedEntity: ServiceRenderedEntity)
    @Query("SELECT * FROM serviceRendered WHERE id_serviceRendered = :id_serviceRendered")
    fun getServiceRenderedById(id_serviceRendered:Int): ServiceRenderedEntity
    @Query("SELECT * FROM serviceRendered")
    fun getServiceRenderedAll():List<ServiceRenderedEntity>
}

class DateConverter {
    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? = date?.time

    @TypeConverter
    fun timestampToDate(timestamp: Long?): Date? = if (timestamp == null) null
    else Date(timestamp)
}
