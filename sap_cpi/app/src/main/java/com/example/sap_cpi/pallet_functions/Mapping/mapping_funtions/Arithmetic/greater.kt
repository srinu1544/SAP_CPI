package com.example.sap_cpi.pallet_functions.Mapping.mapping_funtions.Arithmetic

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage

@Preview
@Composable
fun Greater(){
    LoadImage(imageRes = R.drawable.greater)
}

/*


Function Name: greater

Compares two input values (number1 and number2).
Purpose:

Checks if number1 is greater than number2.
Returns true if number1 > number2, otherwise false.
Input Parameters:

number1 (first number)
number2 (second number)
Usage:

Typically used in conditional mappings.
Can be combined with other functions like IfWithoutElse or BooleanToNumber.
Example:

If number1 = 10, number2 = 5 → Output: true
If number1 = 3, number2 = 8 → Output: false */