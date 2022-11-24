package com.example.mvvmkiparo.data.entity

import android.os.Parcel
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity (tableName = "service")
data class ServiceEntity(
    @PrimaryKey(autoGenerate = true) @SerializedName ("id_service") var id_service:Int,
    @ColumnInfo(name = "nameService") @SerializedName ("nameService") var nameService:String?,
    @ColumnInfo(name = "price") @SerializedName ("price") var price:Double

):Parcelable