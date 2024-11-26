package com.tattadv.remakehealtylife

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Healty(
    var name: String,
    var detail: String,
    var photo: Int
) : Parcelable