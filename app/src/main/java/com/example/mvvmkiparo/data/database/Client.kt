package com.example.mvvmkiparo.data.database


import android.os.Parcel
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


@Entity(tableName = "client")
data class Client(
    @PrimaryKey(autoGenerate = true) @SerializedName ("id_client") var id_client: Int,
    @ColumnInfo(name = "clientName") @SerializedName ("clientName") var clientName: String?,
    @ColumnInfo(name = "organizationName") @SerializedName ("organizationName") var organizationName: String?
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id_client)
        parcel.writeString(clientName)
        parcel.writeString(organizationName)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Client> {
        override fun createFromParcel(parcel: Parcel): Client {
            return Client(parcel)
        }

        override fun newArray(size: Int): Array<Client?> {
            return arrayOfNulls(size)
        }
    }
}

