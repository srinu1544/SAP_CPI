package com.example.sap_cpi.Adapters.Sender

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage

@Preview
@Composable
fun JmsSender() {
    Column {
        LoadImage(imageRes = R.drawable.jms_sender1)
        LoadImage(imageRes = R.drawable.jms_sender2)
    }
}

/*
1️⃣ What is JMS?
JMS (Java Message Service) is a messaging standard that enables asynchronous communication using message queues. It ensures reliable, decoupled, and scalable messaging in enterprise applications.

🔹 In SAP CPI, the JMS Adapter is used for durable, asynchronous, and reliable message exchange.
🔹 It integrates with SAP BTP Enterprise Messaging and other JMS-compliant services.

Jms (Sender adapter) consumer :
------------------------------
The jms sender adapter enables asynchronous decopling of inboud and outbound proecss by using message queue.
the sender adapter consumes message from a jms queue.

2️⃣ Key Features of JMS Adapter in SAP CPI
✅ Asynchronous Messaging → Decouples sender and receiver systems.
✅ Guaranteed Delivery → Messages are stored until successfully processed.
✅ Message Prioritization → High-priority messages are processed first.
✅ Scalability & Load Balancing → Supports high-volume message processing.
✅ Error Handling & Retry Mechanism → Prevents data loss by retrying failed messages.
✅ SAP & Non-SAP Integration → Connects with SAP ECC, S/4HANA, Salesforce, IBM MQ, Apache Kafka, etc.

3️⃣ When to Use the JMS Adapter?
🔹 High-volume message processing (e.g., bulk data processing).
🔹 Decoupled integration where sender & receiver should not depend on each other.
🔹 Reliable message delivery (e.g., order processing, invoice generation).
🔹 Load balancing & high availability for enterprise-scale integrations.

4️⃣ JMS Adapter Modes in SAP CPI
1️⃣ Sender (Consumer) Mode:
✔ Listens to messages from the JMS queue and consumes them.
✔ SAP CPI acts as a message consumer.

2️⃣ Receiver (Producer) Mode:
✔ Sends messages to the JMS queue for later processing.
✔ SAP CPI acts as a message producer.




configure
---------
TODO - https://help.sap.com/docs/cloud-integration/sap-cloud-integration/configure-jms-sender-adapter?q=jms+adapter+sender

PROCESSING DETAILS
------------------
Queue Name (ET):
               -> Enter the name of the message queue
               -> max 80 char
Number of concurent process (TB) :
               -> Enter the number of processes running in parallel for each worker node. the recommended value
               depends on the number of worker nodes.
RETRY DETAILS :
---------------
Retry interval (in min) :
         -> Enter the retry interval time in min for the time to wait retrying message delivery

Exponential BaackOff (CB) :
           -> if select the retry interval is doubled after each unsuccessful retry.

Maximun retry interval (in min) :
               -> visible only if Exponential BaackOff  selected.
               -> enter the value for the maximum amount of time to wait before retrying message delivery.
               -> the minimum value is 10 min , default value is 60 min.

Dead-letter Queue (CB):
           select this check box to place the message in the dead-letter queue if it cannot be processed after two retries.

this is for sizes and limits
---------------------------
TODO - https://community.sap.com/t5/technology-blogs-by-sap/cloud-integration-jms-resource-and-size-limits/ba-p/13322814


Cloud Integration - JMS Resource and Size Limits in SAP CPI
------------------------------------------------------------
JMS Resource and Size Limits in SAP Cloud Integration
In SAP Cloud Integration Enterprise Edition and SAP Integration Suite, JMS messaging resources are limited and must be managed
properly to ensure smooth operation.

Default Allocated Resources
-----------------------------
Number of JMS Queues: 30
Total Queue Capacity: 9300 GB
Maximum Capacity per Queue: 95% of the total capacity
Transactions: 150
Consumers: 150
Producers: 150
Max Messages per Transaction: 256
Message Volume Limit: 150GB per month
SAP allows self-service scaling of JMS resources up to 100 queues. If more than 100 queues are required,
a request must be sent to SAP Support, as JMS resources are shared in the cloud.

JMS Resource Limits for 5 Enterprise Messaging Units
----------------------------------------------------
JMS Queues: 1
Queue Capacity: 300MB
Transactions: 5
Consumers: 5
Producers: 5
Message Volume Limit: 5GB per month

JMS Resource Limits for 100 Message Queues (Example Scenario)
-------------------------------------------------------------
JMS Queues: 100
Queue Capacity: 30GB
Transactions: 500
Consumers: 500
Producers: 500
Message Volume Limit: 500GB per month
Note:

The maximum capacity per queue is 95% of the total allocated capacity.
A maximum of 256 messages can be processed in a single transaction.
Monitoring JMS Resources
To monitor JMS resources, you can use the Queue Monitor in the Manage Storages section under Operations View.

Yellow warning appears when JMS resources reach a critical limit.
Red error message appears when resources are fully exhausted, stopping message processing.
If JMS queues are full, messages will not be processed. Therefore, it is important to clean up unprocessed messages regularly.

For automated notifications when JMS resources reach critical levels, refer to the blog "Automated Notification for Critical or Exhausted JMS Resources".

By efficiently managing JMS resources and size limits, you can ensure smooth messaging operations in SAP Cloud Integration.




*/