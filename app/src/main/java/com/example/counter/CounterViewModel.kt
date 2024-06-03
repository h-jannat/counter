package com.example.counter

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    private var _counter: MutableState<Int> = mutableStateOf(0)

     val counter: MutableState<Int> = _counter

    fun increase(){
        _counter.value++
    }

    fun decrease(){
        _counter.value--
    }

}