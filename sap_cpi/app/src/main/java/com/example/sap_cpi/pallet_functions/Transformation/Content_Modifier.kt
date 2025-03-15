package com.example.sap_cpi.pallet_functions.Transformation



/*content modifier
You use the content modifier step to modify the content of incoming message by providing additional
information in the header or body of the message

Exchange property
-----------------
-> Exchange is a data container that's available during message processing.
-> additional data apart from the actual message can be stored temporarily in the properties area of the exchange.
-> They are available to all the steps in the iflow during message processing
-> exchange properties can be added, deleted and manipulated in CPI. even the whole payload
-> They are not handed over to the receiver systems.
-> never transfer out of an iflow



message headers
---------------
-> headers are usually sent by http based systems to the cpi tenant
-> CPI delete all incoming headers unless they are allowed in the runtime configuration of the integration flow
-> Headers can be added, deleted and manipulated in cpi
-> Headers are handed over to the receiver systems
-> Receiver systems can accept header values of site between 4 kb to 16 kb
-> unwanted header should be deleted before message is sent to receiver.
-> headers will transport to other iflows and receiver system.
-> message headers can be shared data bw dependent iflows



message Body
------------






*/