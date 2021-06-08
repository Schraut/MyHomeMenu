package com.example.myhomemenu.ui.breakfast

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BreakfastViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Breakfast Fragment"
    }
    val text: LiveData<String> = _text
}