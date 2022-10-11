package com.pasandevin.android.mvvm_android.ui.main

import android.util.Log
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var _score = MutableLiveData<Int>().apply {
        value = 6
    }

    var score : LiveData<Int> = _score


    fun increaseScore(){
        _score.value = _score.value?.plus(1)
        Log.d("MainViewModel", "increaseScore: ${_score.value}")

    }
}