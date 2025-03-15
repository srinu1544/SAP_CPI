package com.example.sap_cpi.Adapters.Receiver

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


/*

Receiver Side adapters
----------------------
1.Advanced eventMesh
2.Amazon DynamoDB
3.Amazon EventBridge
4.AMQP
5.Anaplan
6.Ariba -- imp
7.AS2
8.AS4
9.Azure CusmoDB
10.Azure Storage
11.coupa
12.Dropbox
13.Elster
14.Facebook
15.FTP
16.OData  -- imp
17.HTTP   -- imp
18.Hubspot
19.IBMMQ
20.IDOC
21.JDBC
22.JIRA
23.JMS ---- IMP (worked)
24.kafka -- imp
25.LDAP
26.mail   -- imp
27.MDI
28.Microsoft sharepoint
29.Netsuite
30.ODC -- imp
31.open connectors  -- imp
32.process direct
33.RabbitMQ
34.RFC
35.Sales Force pubsub
36.ServiceNow (vendor)
37.SFTP -- imp
38.Slack
39. SMD
40. snow flaks
41.SOAP -- imp (worked)
42.Splunk
43.SuccessFactory
44.Sugar CRM (vendor)
45.Twitter
46.workday (vendor)
47.X1


Note : here vendor is (pojoconsultency.com)



Details :
---------
1. Advanced EventMesh
Supports event-driven messaging via SAP Event Mesh.
Used for real-time event processing and integration.

2. Amazon DynamoDB
Connects SAP CPI to Amazon DynamoDB, a NoSQL database.
Used for high-performance, scalable data storage.

3. Amazon EventBridge
Enables event-driven integration with AWS services.
Used for serverless workflows and event-driven processing.

4. AMQP (Advanced Message Queuing Protocol)
Supports asynchronous messaging using message brokers like RabbitMQ, ActiveMQ, Azure Service Bus.

5. Anaplan
Integrates SAP CPI with Anaplan, a cloud-based financial planning tool.

6. Ariba (Important)
Connects to SAP Ariba, used for procurement and supplier collaboration.
Supports B2B transactions like purchase orders and invoices.

7. AS2 (Applicability Statement 2)
Used for secure B2B EDI communication.
Provides encryption, digital signatures, and non-repudiation.

8. AS4 (Applicability Statement 4)
An extension of AS2, using web services-based B2B messaging.

9. Azure CosmosDB
Connects SAP CPI with Microsoft Azure CosmosDB, a globally distributed NoSQL database.

10. Azure Storage
Enables file storage and retrieval on Microsoft Azure Blob Storage.

11. Coupa
Integrates SAP CPI with Coupa, a cloud-based procurement and spend management platform.

12. Dropbox
Used for file storage, retrieval, and sharing in Dropbox cloud storage.

13. Elster
Used for tax reporting and fiscal compliance (mainly in Germany).

14. Facebook
Enables social media integrations, such as posting updates via SAP CPI.

15. FTP (File Transfer Protocol)
Used for reading and writing files to/from an FTP server.

16. OData (Important)
Connects to OData-based APIs, commonly used in SAP S/4HANA, SuccessFactors, and cloud applications.

17. HTTP (Important)
Supports REST and SOAP API-based integrations.
Used for secure, real-time communication with web applications.

18. HubSpot
Connects SAP CPI with HubSpot, a CRM platform for marketing automation.

19. IBM MQ
Provides asynchronous messaging via IBM MQ message broker.

20. IDOC (Intermediate Document)
Used for SAP-to-SAP communication in SAP ECC and S/4HANA.

21. JDBC (Java Database Connectivity)
Allows SAP CPI to connect to relational databases like Oracle, MySQL, PostgreSQL.

22. JIRA
Enables SAP CPI to interact with Atlassian JIRA for issue tracking and project management.

23. JMS (Important, Worked)
Used for message queue-based asynchronous communication.

24. Kafka (Important)
Connects to Apache Kafka for real-time event streaming and high-throughput messaging.

25. LDAP (Lightweight Directory Access Protocol)
Used for authentication and accessing directory services.

26. Mail (Important)
Enables email-based communication via SMTP, IMAP, or POP3.

27. MDI (Master Data Integration)
Used for synchronizing master data across SAP applications.

28. Microsoft SharePoint
Integrates with SharePoint for document management and collaboration.

29. Netsuite
Connects SAP CPI with Oracle Netsuite, a cloud ERP system.

30. ODC (Important)
Open Data Connector, used for connecting to external data sources securely.

31. Open Connectors (Important)
Provides pre-built connectors for various third-party applications like Salesforce, ServiceNow, HubSpot.

32. Process Direct
Enables direct communication between SAP CPI integration flows.

33. RabbitMQ
Used for event-driven messaging and message queuing.

34. RFC (Remote Function Call)
Connects SAP CPI with SAP ECC/S/4HANA using RFC-based communication.

35. SalesForce PubSub
Enables real-time integration with Salesforce event-driven messaging.

36. ServiceNow (Vendor)
Integrates SAP CPI with ServiceNow for IT service management.

37. SFTP (Important)
Used for secure file transfers over SSH.

38. Slack
Allows SAP CPI to send messages and notifications to Slack channels.

39. SMD (System Monitoring Diagnostics)
Used for system monitoring and logging in SAP environments.

40. Snowflake
Integrates with Snowflake, a cloud-based data warehouse.

41. SOAP (Important, Worked)
Used for SOAP-based web service communication.

42. Splunk
Enables integration with Splunk for log monitoring and analytics.

43. SuccessFactors
Connects SAP CPI with SAP SuccessFactors for HR process automation.

44. Sugar CRM (Vendor)
Integrates SAP CPI with SugarCRM, a customer relationship management tool.

45. Twitter
Allows SAP CPI to interact with Twitter APIs for social media automation.

46. Workday (Vendor)
Connects SAP CPI with Workday, a cloud-based HCM and finance application.

47. X1
The XI (Exchange Infrastructure) Adapter in SAP CPI is primarily used to integrate with SAP
Process Integration (PI) / Process Orchestration (PO) systems. It helps in exchanging messages
between SAP Cloud Integration (CPI) and on-premise SAP PI/PO systems.















*/