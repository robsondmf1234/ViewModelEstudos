package com.example.viewmodelestudo.viewmodel

import androidx.lifecycle.ViewModel

//Classe View MOdel
class MainActivityViewModel : ViewModel() {

    var myNumber = 0
    fun addNUmber() {
        myNumber++
    }

    override fun onCleared() {
        super.onCleared()
    }
}