package com.example.mvvmkiparo.data.database

import android.os.Parcel
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.util.*

@Entity(
    tableName = "serviceRendered", foreignKeys = [ForeignKey(
        entity = Client::class,
        parentColumns = ["id_client"],
        childColumns = ["client_id"],
        onUpdate = CASCADE
    ), ForeignKey(
        entity = Service::class,
        parentColumns = ["id_service"],
        childColumns = ["service_id"],
        onUpdate = CASCADE
    ), ForeignKey(
        entity = PriceCondition::class,
        parentColumns = ["id_priceCondition"],
        childColumns = ["priceCondition_id"],
        onUpdate = CASCADE
    )]
)
data class ServiceRendered(
    @PrimaryKey(autoGenerate = true) @SerializedName("id_serviceRendered") var id_serviceRendered: Int,
    @ColumnInfo(name = "client_id") @SerializedName("client_id") var client_id: Int,
    @ColumnInfo(name = "service_id") @SerializedName("service_id") var service_id: Int,
    @ColumnInfo(name = "priceCondition_id") @SerializedName("priceCondition_id") var priceCondition_id: Int,
    @ColumnInfo(name = "time") @SerializedName("time") var time: Date?
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        TODO("time")
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id_serviceRendered)
        parcel.writeInt(client_id)
        parcel.writeInt(service_id)
        parcel.writeInt(priceCondition_id)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ServiceRendered> {
        override fun createFromParcel(parcel: Parcel): ServiceRendered {
            return ServiceRendered(parcel)
        }

        override fun newArray(size: Int): Array<ServiceRendered?> {
            return arrayOfNulls(size)
        }
    }
}
