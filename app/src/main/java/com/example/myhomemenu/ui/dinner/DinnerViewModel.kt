package com.example.myhomemenu.ui.dinner

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DinnerViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is dinner Fragment"
    }
    val text: LiveData<String> = _text
}