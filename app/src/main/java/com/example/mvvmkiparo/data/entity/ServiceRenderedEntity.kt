package com.example.mvvmkiparo.data.entity

import android.os.Parcel
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import java.util.*
@Parcelize
@Entity(
    tableName = "serviceRendered", foreignKeys = [ForeignKey(
        entity = ClientEntity::class,
        parentColumns = ["id_client"],
        childColumns = ["client_id"],
        onUpdate = CASCADE
    ), ForeignKey(
        entity = ServiceEntity::class,
        parentColumns = ["id_service"],
        childColumns = ["service_id"],
        onUpdate = CASCADE
    ), ForeignKey(
        entity = PriceConditionEntity::class,
        parentColumns = ["id_priceCondition"],
        childColumns = ["priceCondition_id"],
        onUpdate = CASCADE
    )]
)
data class ServiceRenderedEntity(
    @PrimaryKey(autoGenerate = true) @SerializedName("id_serviceRendered") var id_serviceRendered: Int,
    @ColumnInfo(name = "client_id", index = true) @SerializedName("client_id") var client_id: Int,
    @ColumnInfo(name = "service_id", index = true) @SerializedName("service_id") var service_id: Int,
    @ColumnInfo(name = "priceCondition_id", index = true) @SerializedName("priceCondition_id") var priceCondition_id: Int,
    @ColumnInfo(name = "time") @SerializedName("time") var time: Date?
):Parcelable
