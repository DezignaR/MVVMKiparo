package com.example.mvvmkiparo.data.entity


import android.os.Parcel
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "client")
data class ClientEntity(
    @PrimaryKey(autoGenerate = true) @SerializedName ("id_client") var id_client: Int,
    @ColumnInfo(name = "clientName") @SerializedName ("clientName") var clientName: String?,
    @ColumnInfo(name = "organizationName") @SerializedName ("organizationName") var organizationName: String?
):Parcelable

