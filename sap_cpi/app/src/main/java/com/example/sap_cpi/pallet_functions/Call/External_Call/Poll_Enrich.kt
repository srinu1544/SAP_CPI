package com.example.sap_cpi.pallet_functions.Call.External_Call

/*Poll Enrich is a message processing step in SAP CPI (Cloud Platform Integration) that allows an integration flow (IFlow) to poll data from an external source and merge it with an existing message.
It is commonly used when an integration requires additional data from another system during processing

it supports only SFTP adapter
it is used to pick the file and send the file to next step



 How Poll Enrich Works
It retrieves data from an external system (e.g., SFTP).
It enriches the existing message by merging the retrieved data with the original message.
The original message remains the main message, while the polled data is used as enrichment.


 When to Use Poll Enrich?
Use Poll Enrich when:
✅ You need to fetch additional data before sending the final message.
✅ The data must be retrieved dynamically from another system.
✅ You want to poll data periodically within an integration flow.

Example use cases:

Fetching customer details from an external system before sending an order request.
Retrieving exchange rates from an API before processing a financial transaction.
Fetching a file from SFTP and merging it with another message payload.


 How to Configure Poll Enrich in SAP CPI
Open your IFlow in SAP CPI.
Drag & Drop the Poll Enrich step from the palette.
Choose the Adapter Type (e.g., SFTP, HTTP, SOAP, OData).
Configure the connection settings (e.g., URL, credentials, polling frequency).
Define the merge strategy (how the fetched data should be merged with the original message).

















*/