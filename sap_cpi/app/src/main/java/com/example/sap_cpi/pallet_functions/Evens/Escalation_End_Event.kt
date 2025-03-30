package com.example.sap_cpi.pallet_functions.Evens


/*






config : (General , Processing)
TODO - https://help.sap.com/docs/cloud-integration/sap-cloud-integration/define-escalation-event?q=Escalation+End+Event+

General : (Name):
-----------------

Processing :
------------
  Category (DD) : Routing condition not meet
                  Receiver not reachable
                  Receiver not found
                  Not authenticated to invoke receiver
                  Not authorized to invoke receiver
                  Receiver tries to redirect
                  internal server error in receiver
                  others not further qualified

when you select one of the Escalation Categories from the dropdown, it essentially defines the type of error or
issue that has occurred during the message processing. Based on the category selected, a corresponding message
or action will be triggered.


Escalation Event                         Routing condition has not been met.
---------------------------------------------------------------------------------
Receiver not reachable                   Receiver could not be reached, because it is temporarily down
                                         or not accessible (for example, due to overload or maintenance work).

Receiver not found                       Receiver could not be found because the URL points to a non-existent
                                         resource (for example, HTTP 404 error).

Not authenticated to invoke receiver     Receiver could not be called because authentication has failed
                                         (for example, HTTP 401 error).

Not authorized to invoke receiver         Receiver could not be called because of insufficient permissions
                                          (for example, HTTP 403 error).

Receiver tries to redirect                Receiver could not be reached (HTTP 302 error).

Internal server error in receiver         Internal server error occurred in the receiver system (for example, HTTP 500 error).

Others – not further qualified            Escalation category has not been further qualified.






*/

