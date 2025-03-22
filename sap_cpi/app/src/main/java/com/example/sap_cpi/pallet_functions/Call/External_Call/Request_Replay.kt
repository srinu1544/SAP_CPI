package com.example.sap_cpi.pallet_functions.Call.External_Call

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage

@Preview
@Composable
fun RequestReplay() {
    LoadImage(imageRes = R.drawable.request_replay)
}


/* Request Replay :
   --------------
This is a process step that allows to you to send a request message to a receiver system and receives a
replay message from it. this is useful when you need to synchronize the communication between different
systems or services you can use request replay in scenarios where you need to get a confirmation acknowledgement
or response from the receiver system.
->  Request Replay can connect with only receiver system


 Configure : (General)
 -----------
 General (only can change name)


*/
