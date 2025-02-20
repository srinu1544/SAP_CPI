package com.example.sap_cpi.pallet_functions.Call.External_Call

import android.graphics.drawable.Drawable
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.image.LoadImage


@Preview
@Composable
fun composable() {
    LoadImage(R.drawable.pollenrich)
}
/*



-> it supports only SFTP adapter only
-> it is used to pick the file and send the file to next step
->  it is used for only received the files
->  it is used fot get the data from the SFTP only
->  if their requirement wants to get the dara from the SFTP folder in between the flow we can use the poll enrich
-> it will be connected to only sender system

when file pics
once the sender sends the data to the iflow (data process initiate) poll enrich activate get the data from SFTP





















*/