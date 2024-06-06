package com.example.counter

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel(): ViewModel() {
    private val _repository: CounterRepository = CounterRepository()
    private var _counter: MutableState<Int> = mutableIntStateOf(_repository.getCounter().count)

     val counter: MutableState<Int> = _counter

    fun increase(){
        _repository.increase()
        _counter.value = _repository.getCounter().count
    }

    fun decrease(){
        _repository.decrease()
        _counter.value = _repository.getCounter().count
    }

}