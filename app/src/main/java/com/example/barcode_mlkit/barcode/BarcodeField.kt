package com.example.barcode_mlkit.barcode

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/** Information about a barcode field. */
@Parcelize
data class BarcodeField(val label: String, val value: String) : Parcelable
