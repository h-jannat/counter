package com.example.counter

 data class CounterModel(var count: Int)

class CounterRepository{
    private var counter = CounterModel(count = 0)
    fun getCounter()= counter
    fun increase(){
        counter.count++
    }

    fun decrease(){
        counter.count--
    }
}