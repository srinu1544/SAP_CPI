package com.example.sap_cpi.Adapters.Sender

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage

@Preview
@Composable
fun OdataSender(){
    Column {
        LoadImage(imageRes = R.drawable.odata_sender)
    }
}