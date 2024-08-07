package com.example.practiceapp

object Validator {

    fun validatorInput(amount : Int , description  : String) : Boolean {

        return !(amount <= 0 || description.isEmpty())

    }
}