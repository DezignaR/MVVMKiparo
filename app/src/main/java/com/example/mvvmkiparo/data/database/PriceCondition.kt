package com.example.mvvmkiparo.data.database

import android.os.Parcel
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity (tableName = "priceCondition")
data class PriceCondition(
    @PrimaryKey(autoGenerate = true) @SerializedName ("id_priceCondition") var id_priceCondition:Int,
    @ColumnInfo(name = "namePriceCondition") @SerializedName ("namePriceCondition") var namePriceCondition:String?
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id_priceCondition)
        parcel.writeString(namePriceCondition)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PriceCondition> {
        override fun createFromParcel(parcel: Parcel): PriceCondition {
            return PriceCondition(parcel)
        }

        override fun newArray(size: Int): Array<PriceCondition?> {
            return arrayOfNulls(size)
        }
    }
}
