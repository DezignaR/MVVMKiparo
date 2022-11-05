package com.example.mvvmkiparo.data.database

import androidx.room.*
import java.util.*

@Dao
interface GeneralDao {
    //Client
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertClient(client: Client)
    @Delete
    fun deleteClient(client: Client)
    @Update
    fun updateClient(client: Client)
    @Query("SELECT * FROM client WHERE id_client = :id_client")
    fun getClientById(id_client:Int): Client
    @Query("SELECT * FROM client")
    fun getClientAll():List<Client>

    //Service
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertService(service: Service)
    @Delete
    fun deleteService(service: Service)
    @Update
    fun updateService(service: Service)
    @Query("SELECT * FROM service WHERE id_service = :id_service")
    fun getServiceById(id_service:Int): Service
    @Query("SELECT * FROM service")
    fun getServiceAll():List<Service>

    //PriceCondition
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPriceCondition(priceCondition: PriceCondition)
    @Delete
    fun deletePriceCondition(priceCondition: PriceCondition)
    @Update
    fun updatePriceCondition(priceCondition: PriceCondition)
    @Query("SELECT * FROM priceCondition WHERE id_priceCondition = :id_priceCondition")
    fun getPriceConditionById(id_priceCondition:Int): PriceCondition
    @Query("SELECT * FROM priceCondition")
    fun getPriceConditionAll():List<PriceCondition>

    //ServiceRendered
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertServiceRendered(serviceRendered: ServiceRendered)
    @Delete
    fun deleteServiceRendered(serviceRendered: ServiceRendered)
    @Update
    fun updateServiceRendered(serviceRendered: ServiceRendered)
    @Query("SELECT * FROM serviceRendered WHERE id_serviceRendered = :id_serviceRendered")
    fun getServiceRenderedById(id_serviceRendered:Int): ServiceRendered
    @Query("SELECT * FROM serviceRendered")
    fun getServiceRenderedAll():List<ServiceRendered>
}

class DateConverter {
    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? = date?.time

    @TypeConverter
    fun timestampToDate(timestamp: Long?): Date? = if (timestamp == null) null
    else Date(timestamp)
}
