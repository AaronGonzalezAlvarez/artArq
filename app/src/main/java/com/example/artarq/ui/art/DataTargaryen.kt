package com.example.artarq.ui.art

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class DataTargaryen(
    @StringRes val descripcion: Int,
    val nombreRey: String,
    val year: Int,
    @DrawableRes val imageTargaryen: Int
)
