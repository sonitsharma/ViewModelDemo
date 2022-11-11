package com.sonit.viewmodelfactoryproject

import androidx.lifecycle.ViewModel

class MainActivityViewModel (defaultEvenNumber:Int): ViewModel() {


   private var multiplier:Int = 0
    private  var result : Int = 0

    init{
        multiplier = defaultEvenNumber
    }

 fun getMultiplier():Int{
     return multiplier
 }

    fun getEvenNumber():Int{
        return result
    }

    fun makeNumber_Even(inputValue:Int) {
     result = inputValue * multiplier }
}