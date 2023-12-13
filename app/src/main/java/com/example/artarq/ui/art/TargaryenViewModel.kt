package com.example.artarq.ui.art

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class TargaryenViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(TargaryenUiState())
    val uiState: StateFlow<TargaryenUiState> = _uiState.asStateFlow()

    fun siguiente(){
        var indexAux = _uiState.value.index
        indexAux++
        if(indexAux>=5){
            indexAux=0
        }
            _uiState.update { currentState -> currentState.copy(
                year = DatosTargaryen.topics.get(indexAux).year,
                titulo = DatosTargaryen.topics.get(indexAux).descripcion,
                img = DatosTargaryen.topics.get(indexAux).imageTargaryen,
                nameRey = DatosTargaryen.topics.get(indexAux).nombreRey,
                index = indexAux
            ) }
    }

    fun atras(){
        var indexAux = _uiState.value.index
        indexAux--
        if(indexAux<0){
            indexAux=4
        }
        _uiState.update { currentState -> currentState.copy(
            year = DatosTargaryen.topics.get(indexAux).year,
            titulo = DatosTargaryen.topics.get(indexAux).descripcion,
            img = DatosTargaryen.topics.get(indexAux).imageTargaryen,
            nameRey = DatosTargaryen.topics.get(indexAux).nombreRey,
            index = indexAux
        ) }
    }
}