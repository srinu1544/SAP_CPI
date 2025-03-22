package com.example.sap_cpi.Adapters.Sender

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage

@Preview
@Composable
fun Http(){
    Column {
        LoadImage(imageRes = R.drawable.https1)
        LoadImage(imageRes = R.drawable.https2)
    }
}

/*


http  adapter  (sender) (inbound) :
----------------------------------
-> we use http adapter to send and receive messages using http protocol
and it provides additional security features SSL,TLS encryption client authentication
we need this adapter when exchange data securely , reliably , with receiver systems that supports.

-> To use http adapter to call restful web services, access odata apis or send messages to cloud applications
-> we can also use http adapter for communicate with other cpi tenants or custom applications that expose
Http interfaces

configure : General (name) , connections  condition
===================================================
connections
----------
Address (ET) :
-> give any end point name with / first symbol
ex : /getDATA

Authentication (DD) : User Role
                     Client certificate

user Role :
----------
-> ESB.Message.send  this is default
-> when you choose user role the inbound authorization is checked based on user role.

client certificate :
---------------------
verifier ----> identify of the sender
In this option you always have to select one or more client certificates by using add option

CSRF (CB)-- Cross-Site Request Forgery (CSRF)
This option prevents Cross-Site Request Forgery (CSRF), which is a malicious online attack. Such attacks exposes user
content without their authorization.

Note :
During an inbound HTTPS communication, if the sender adapter receives a GET or HEAD request to fetch the CSRF
token value and you have the enabled CSRF Protected then the adapter will return the CSRF token and stop processing
the message further.

Include X-CSRF-Token in the HTTP header field for all modifying requests and these requests are validated during runtime.
If the validation fails then the server returns “HTTP 403 Forbidden” status code.

condition :
-----------
we mention the body site of inbound messages if messages is increased limit size the message is
rejected automatically and error message will generated
->body size default 40 mb



*/