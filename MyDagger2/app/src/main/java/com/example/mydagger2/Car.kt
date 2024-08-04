package com.example.mydagger2

import javax.inject.Inject



class Car @Inject constructor(wheeels: Wheeels, engine: Engine) {


    fun start(){
        println("Car started")
    }



}