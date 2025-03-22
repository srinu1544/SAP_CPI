package com.example.sap_cpi.Adapters.Receiver

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage


@Preview
@Composable
fun OpenConnectors(){
    Column {
        LoadImage(imageRes = R.drawable.open_connectors1)
        LoadImage(imageRes = R.drawable.open_connectors2)
    }
}

/*
open connectors Receiver adapter :
----------------------------------
You use the OpenConnectors receiver adapter in integration flows to communicate with more than
170 non-SAP cloud applications that are supported by Open Connectors.

-> we have only receiver side adapter
->
->


configure :
TODO - https://help.sap.com/docs/cloud-integration/sap-cloud-integration/openconnectors-receiver-adapter?q=open+connectors+adapter












*/