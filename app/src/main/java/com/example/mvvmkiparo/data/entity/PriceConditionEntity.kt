package com.example.mvvmkiparo.data.entity

import android.os.Parcel
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity (tableName = "priceCondition")
data class PriceConditionEntity(
    @PrimaryKey(autoGenerate = true) @SerializedName ("id_priceCondition") var id_priceCondition:Int,
    @ColumnInfo(name = "namePriceCondition") @SerializedName ("namePriceCondition") var namePriceCondition:String?
):Parcelable
