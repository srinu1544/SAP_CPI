package com.example.sap_cpi.Differences

/*Difference between Request Replay  and send

Request Replay :
----------------
-> It is send the data to the receiver system and get the data back from the receiver system like a synchronous call
-> the new response coming from the receiver system is collapsing with coming from the before request reply step like the new data is
collapsing with the old data.

Send :
-> It is send the data to the receiver system and did not get the data back from the receiver system like a asynchronous call
-> In the no response from the receiver so the new data is not collapsing with the old data. which is send directly to the next step
of send also.
-> If you want to send the data in between the flow we can go with the send.


*/