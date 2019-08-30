package com.example.myapplication

import android.os.Parcel
import android.os.Parcelable

class Movie(val title: String?,
            val genre: String?,
            val year: String?) : Parcelable {

    companion object {
        @JvmField
        val CREATOR = object : Parcelable.Creator<Movie> {
            override fun createFromParcel(parcel: Parcel) = Movie(parcel)
            override fun newArray(size: Int) = arrayOfNulls<Movie>(size)
        }
    }

    private constructor(parcel: Parcel) : this(
            title = parcel.readString(),
            genre = parcel.readString(),
            year = parcel.readString()
            )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(genre)
        parcel.writeString(year)
    }

    override fun describeContents() = 0
}

