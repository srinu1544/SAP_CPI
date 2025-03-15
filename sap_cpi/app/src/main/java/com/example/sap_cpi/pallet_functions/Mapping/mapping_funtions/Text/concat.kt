package com.example.sap_cpi.pallet_functions.Mapping.mapping_funtions.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage

@Preview
@Composable
fun Concat() {
    LoadImage(imageRes = R.drawable.concat)
}

/*

concat :
--------
Concat Function in SAP CPI
The "concat" function is used in Message Mapping or Graphical Mapping in SAP CPI. It is designed to concatenate (join) multiple string values together into a single output.

string1 – The first string input.
string2 – The second string input.
Delimiter String – An optional delimiter (e.g., space, comma, etc.) that can be inserted between string1 and string2.
     
How It Works
------------
This function takes string1 and string2, joins them, and optionally inserts a delimiter between them.
If no delimiter is provided, it simply concatenates the two strings directly.

Example
Input:
string1 = "SAP"
string2 = "CPI"
Delimiter String = "-"

Output:
"SAP-CPI"
If no delimiter is provided:
"SAPCPI"

*/