package com.example.sap_cpi.pallet_functions.process

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage


@Preview
@Composable
fun Image(){
    LoadImage(imageRes = R.drawable.exception_subprocess)
}


/*
You use this element to catch any exceptions thrown in the integration process and handle them.
-> In exception subprocess we have only general to change name please refer image
-> in this middle of process add send pallet function and send the data to different systems using adapters

if you want to get messageid for sending through mail use
for message id : is ${header.SAP_MessageProcessingLogID}
for  error message :  is ${exception.message}
for iflow name     :   ${camelId}
for log stack trace : ${exception.stacktrace}
for exchangeId       ${exchangeId}

Exchange ID: ${id}

Exception Type: ${exception.class}
Stack Trace: ${exception.stacktrace}


for current date : ${date:now:yyyy-MM-dd HH:mm:ss}




correlationId :
The correlation ID lets you track related messages in the monitor. For instance,
when you call one iflow from another using the Process Direct adapter, the correlation
ID will let you follow the calls. Without it, you can't immediately tell that those two messages are related.

*/

