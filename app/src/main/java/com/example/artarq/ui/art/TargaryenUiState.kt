package com.example.artarq.ui.art

data class TargaryenUiState(
    val  year:Int = DatosTargaryen.topics.get(0).year,
    val titulo:Int = DatosTargaryen.topics.get(0).descripcion,
    val nameRey:String = DatosTargaryen.topics.get(0).nombreRey,
    val img:Int = DatosTargaryen.topics.get(0).imageTargaryen,
    val index:Int =0
)
