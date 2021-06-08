package com.example.myhomemenu.ui.lunch

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LunchViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is lunch Fragment"
    }
    val text: LiveData<String> = _text
}
