package com.example.sap_cpi.Adapters.Sender

/*

CSRF -- Cross-Site Request Forgery (CSRF)
This option prevents Cross-Site Request Forgery (CSRF), which is a malicious online attack. Such attacks exposes user
content without their authorization.

Note :
During an inbound HTTPS communication, if the sender adapter receives a GET or HEAD request to fetch the CSRF
token value and you have the enabled CSRF Protected then the adapter will return the CSRF token and stop processing
the message further.

Include X-CSRF-Token in the HTTP header field for all modifying requests and these requests are validated during runtime.
If the validation fails then the server returns “HTTP 403 Forbidden” status code.



*/