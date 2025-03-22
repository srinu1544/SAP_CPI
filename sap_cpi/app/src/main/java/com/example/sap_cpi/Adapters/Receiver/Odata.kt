package com.example.sap_cpi.Adapters.Receiver

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage

@Preview
@Composable
fun OdataReceiver(){
    Column {
        LoadImage(imageRes = R.drawable.odata_receiver1)
        LoadImage(imageRes = R.drawable.odata_receiver2)
        LoadImage(imageRes = R.drawable.odata_receiver3)
        LoadImage(imageRes = R.drawable.odata_receiver4)
    }
}