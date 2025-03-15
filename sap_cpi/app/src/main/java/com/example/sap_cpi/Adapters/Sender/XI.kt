package com.example.sap_cpi.Adapters.Sender

/*Uses of XI Adapter in SAP CPI (Cloud Platform Integration)
The XI (Exchange Infrastructure) Adapter in SAP CPI is primarily used to integrate with SAP
Process Integration (PI) / Process Orchestration (PO) systems. It helps in exchanging messages
between SAP Cloud Integration (CPI) and on-premise SAP PI/PO systems.

Key Uses of the XI Adapter in SAP CPI
1. Seamless Integration with SAP PI/PO
Allows secure message exchange between SAP Cloud Integration and SAP PI/PO.
Ensures compatibility with existing SAP PI/PO scenarios.
2. Supports Asynchronous and Synchronous Messaging
Synchronous Mode: Used for request-response message exchanges.
Asynchronous Mode: Used for one-way message transmission.
3. Supports Multiple SAP PI/PO Message Protocols
XI 3.0 Protocol (for connecting with SAP PI/PO).
SOAP Protocol (when communicating with SAP services).
4. Enables Standard and Custom Message Mappings
Supports SAP PI message mappings (XSLT, Java, or graphical mappings).
Ensures data transformation between different formats (XML, JSON, IDoc, etc.).
5. Supports Secure Communication
Uses HTTPS with client certificates for secure data transfer.
Supports user authentication via Basic Authentication or Certificates.
6. Works with SAP Backend Systems
Helps exchange data between SAP ERP, S/4HANA, or other SAP systems via PI/PO.
Supports IDoc, RFC, and Proxy-based communication.
7. Retry Mechanism & Error Handling
Built-in error handling and monitoring capabilities.
Supports retries and message persistence to ensure data is not lost.

When to Use the XI Adapter?
✅ If your SAP landscape includes SAP PI/PO, and you need to connect it with SAP CPI.
✅ When existing PI/PO message mappings need to be reused in SAP CPI.
✅ For secure and reliable message exchange between on-premise SAP systems and SAP Cloud.

Would you like more details on a specific use case? */