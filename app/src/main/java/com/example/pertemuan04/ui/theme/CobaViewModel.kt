package com.example.pertemuan04.ui.theme

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.pertemuan04.Data.Dataform
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel() {
    var namaUsr: String by mutableStateOf("")
        private set
    var noTlp: String by mutableStateOf("")
        private set
    var jeniKl: String by mutableStateOf("")
        private set
    private val _uiState = MutableStateFlow(Dataform())
    val uiState: StateFlow<Dataform> = _uiState.asStateFlow()

    fun insertData(nm: String, tlp:String, jk: String){
        namaUsr = nm;
        noTlp = tlp;
        jeniKl = jk;
    }

    fun setJenisK(pilihJK: String){
        _uiState.update { currentState -> currentState.copy(sex = pilihJK)}
    }
}
