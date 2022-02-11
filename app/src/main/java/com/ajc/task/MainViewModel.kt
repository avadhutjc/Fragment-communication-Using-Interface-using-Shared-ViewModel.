package com.ajc.task

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val data: MutableLiveData<Int> = MutableLiveData<Int>()
    private val data1: MutableLiveData<Int> = MutableLiveData<Int>()

    init {
        data.value = 10
        data1.value = 2
    }

    val dData: LiveData<Int> = data
    val dData1: LiveData<Int> = data1

    fun setValue() {
        data.value = data.value!! + 1
    }

    fun setValue1() {
        data1.value = data1.value!! + 2
    }

}