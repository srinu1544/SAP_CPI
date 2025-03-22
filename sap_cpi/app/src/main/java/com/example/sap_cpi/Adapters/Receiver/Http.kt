package com.example.sap_cpi.Adapters.Receiver

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage

@Preview
@Composable
fun Http(){
    Column {
        LoadImage(imageRes = R.drawable.http1)
        LoadImage(imageRes = R.drawable.http2)
        LoadImage(imageRes = R.drawable.http3)
    }
}

/*
http  adapter :
-----------------------
-> we use http adapter to send and receive messages using http protocol
and it provides additional security features SSL,TLS encryption client authentication
we need this adapter when exchange data securely , reliably , with receiver systems that supports.

-> To use http adapter to call restful web services, access odata apis or send messsages to cloud applications
-> we can also use http adapter for communicate with other cpi tenants or custom applications that expose
Http interfaces

configure :  (General , connection)
-----------------------------------
General : name
--------

Connection :
-----------
   address (ET) :
      -> host & port name

   query (ET) :
       -> In this field you have enter the query
        note : query string must not entered in address field.
       ->  it can be static value or it can be externalize using a variable.

  Proxy type (DD) : (internet, on-premise)
     if select internet data routing happens via internet
     you can chose on premise when you want to exchange messages within on-premise systems enter the
     proxy type location id which is a unique identifier for the cloud connector instance under the
     method you can choose the http action

  method :
      dynamic -> dynamically change the method variable substitution
      Delete
      Get
      HEAD
      POST
      PUT
      Trace
Authentication (DD):
   basic
   OAuth2 client credentials
   None
   OAuth SAML bearer assertion
   client certificate
   principal propagation (visible if select proxy type is on-premise)

Timeout (CB)  :
  time to tenant wait for response before terminate  the message.

Throw Exception on Failure (CB) :
Attach Error details on failure (CB) :

Header Details : (Request header , Response header) :
   In the request header settings you can define the custom headers that
   you want to send to the target system. In the response header section , you can
   enter the custom header that you would expect as a response from the target system.























*/