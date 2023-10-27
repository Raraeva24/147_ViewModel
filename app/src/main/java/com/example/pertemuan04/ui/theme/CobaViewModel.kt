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
    var emailUsr: String by mutableStateOf("")
        private set
    var almt: String by mutableStateOf("")
        private set
    var sts: String by mutableStateOf("")
        private set

    private val _uiState = MutableStateFlow(Dataform())
    val uiState: StateFlow<Dataform> = _uiState.asStateFlow()


    fun insertData(nm: String, tlp:String, jk: String, al: String, eml: String, st: String){
        namaUsr = nm;
        noTlp = tlp;
        jeniKl = jk;
        emailUsr = eml;
        almt = al;
        sts = st


    }

    fun setJenisK(pilihJK: String){
        _uiState.update { currentState -> currentState.copy(sex = pilihJK)}
    }
    fun setStatus(pilihSts: String){
        _uiState.update {currentState -> currentState.copy(status= pilihSts)}
    }
}
