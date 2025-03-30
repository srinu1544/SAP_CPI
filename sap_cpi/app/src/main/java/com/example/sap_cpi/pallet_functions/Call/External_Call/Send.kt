package com.example.sap_cpi.pallet_functions.Call.External_Call

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage

@Preview
@Composable
fun Send(){
    LoadImage(imageRes = R.drawable.send)
}

/*
SEND

This is a process step that allows you to send a message to one or more receiver system without
expecting a replay.This is useful when you need to perform asynchronous communication between different systems you
need to broadcast, distribute or public a message to the receiver system.
-> if you want to send data in between the flow to receiver system we go through send
-> in send payload available at next step of send also.

You use a send step type to configure a service call to a receiver system for scenarios and
adapters where no reply is expected.

note : their is no data collapse.

config :  (Name)
--------
TODO - https://help.sap.com/docs/cloud-integration/sap-cloud-integration/define-send-step?q=send
Their is no config













*/
