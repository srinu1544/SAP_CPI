package com.example.practiceapp


import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4 :: class)
class ValidatorTest{

    @Test
    fun whenInputIsInValid(){
        val amount = 0

        val description = ""
        val result = Validator.validatorInput(amount,description)
        assertThat(result).isEqualTo(false)
    }
}