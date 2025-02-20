package com.example.sap_cpi.Adapters.Sender

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


/*
Sender Side adapters
----------------------
1.Advanced eventMesh
2.AMQP
3.Ariba -- imp
4.AS2
5.AS$
6.AzureStorage
7.DataStore
8.DropBox
9.FTP
10.HTTPS - imp
11.IBMMQ
12.IDOC  -- Imp
13.JMS   -- imp
14.Kafka -- imp
15.mail  -- imp
16.microsoft share point
17.OData  -- imp
18.Process Direct - imp
19.SalesForce PubSub
20.SFTP
21.Slack
22.SMB
23.SOAP  -- imp
24.splunk
25.SucccessFactory  -- imp
26.X1





details :
---------
1. Advanced EventMesh
Enables event-driven communication using SAP Event Mesh.
Supports real-time message distribution across systems.

2. AMQP (Advanced Message Queuing Protocol)
A message-oriented protocol for asynchronous communication.
Commonly used in cloud messaging services like RabbitMQ and Azure Service Bus.

3. Ariba (Important)
Used for SAP Ariba procurement and supplier management integration.
Supports document exchange like purchase orders and invoices.

4. AS2 (Applicability Statement 2)
Enables secure B2B data exchange using encryption and digital signatures.
Commonly used for EDI (Electronic Data Interchange) transactions.

5. AS4 (Applicability Statement 4)
An extension of AS2, providing web services-based B2B messaging.
Supports XML-based secure communication.

6. Azure Storage
Connects SAP CPI to Microsoft Azure Blob Storage.
Used for file-based integration and cloud storage.

7. DataStore
Stores and retrieves messages for reprocessing within SAP CPI.
Useful for message persistence and monitoring.

8. Dropbox
Allows file transfer and storage integration with Dropbox cloud storage.
Used in document sharing and backup scenarios.

9. FTP (File Transfer Protocol)
Used for reading and writing files from/to an FTP server.
Supports batch processing and file-based integration.

10. HTTPS (Important)
Supports REST API and SOAP API-based integration.
Used for secure, real-time communication with external applications.

11. IBM MQ
Integrates SAP CPI with IBM MQ message broker.
Ensures asynchronous messaging and guaranteed delivery.

12. IDOC (Important)
Used for SAP-to-SAP integration through IDoc messages.
Common in SAP ECC and SAP S/4HANA for business process automation.

13. JMS (Important)
A message queue-based adapter for asynchronous messaging.
Ensures reliable and scalable message delivery.

14. Kafka (Important)
Used for real-time data streaming and event-driven architectures.
Supports high-throughput, scalable message processing.

15. Mail (Important)
Enables email-based communication from/to SAP CPI.
Supports SMTP, IMAP, and POP3 protocols.

16. Microsoft SharePoint
Integrates SAP CPI with Microsoft SharePoint for document management.
Used for file storage and collaboration.

17. OData (Important)
Used for exchanging structured data via OData services.
Common in SAP S/4HANA, SAP SuccessFactors, and cloud applications.

18. Process Direct (Important)
Enables direct communication between integration flows within SAP CPI.
Helps in modularizing and reusing integration logic.

19. SalesForce PubSub
Connects SAP CPI with Salesforce using event-driven messaging.
Supports real-time data exchange.

20. SFTP (Secure File Transfer Protocol)
Used for secure file transfers between SAP CPI and external systems.
Supports public key authentication and encryption.

21. Slack
Enables SAP CPI to send messages and notifications to Slack channels.
Used in business workflows and monitoring alerts.

22. SMB (Server Message Block)
A protocol for file sharing and network communication.
Enables integration with Windows-based file systems.

23. SOAP (Important)
Used for integrating with SOAP-based web services.
Commonly used in SAP ECC, S/4HANA, and third-party applications.

24. Splunk
Integrates with Splunk for log analysis and monitoring.
Useful in security and operational intelligence.

25. SuccessFactors (Important)
Connects SAP CPI with SAP SuccessFactors for HR process integration.
Used for employee data synchronization and payroll processing.

26. X1
Likely refers to a custom or specialized adapter (Needs clarification).










*/