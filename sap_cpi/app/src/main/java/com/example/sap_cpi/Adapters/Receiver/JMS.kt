package com.example.sap_cpi.Adapters.Receiver

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage

@Preview
@Composable
fun JmsReceiver(){
    Column {
        LoadImage(imageRes = R.drawable.jms_receiver1)
        LoadImage(imageRes = R.drawable.jms_receiver2)
    }
}

/*


 1️⃣ What is JMS?
JMS (Java Message Service) is a messaging standard that enables asynchronous communication using message queues. It ensures reliable, decoupled, and scalable messaging in enterprise applications.

🔹 In SAP CPI, the JMS Adapter is used for durable, asynchronous, and reliable message exchange.
🔹 It integrates with SAP BTP Enterprise Messaging and other JMS-compliant services.

Jms (Receiver adapter) producer  :
------------------------------
The jms sender adapter enables asynchronous decopling of inboud and outbound proecss by using message queue.
the receiver adapter stores messages and schedule them for processing in queue.

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
TODO - https://help.sap.com/docs/cloud-integration/sap-cloud-integration/configure-jms-receiver-adapter?q=jms+adapter+receiver

PROCESSING DETAILS
------------------
Queue Name (ET):
               -> Enter the name of the message queue
               -> max 80 char

Retention threshold for alerting (in d) :
                ->  Enter the time period in days by which the message haveing to be fetched.
                -> the default value is 2

Expiration period (in d) :
                -> enter the time period in days by which the messages have to be fetcched specify a time period
                for expiration period which is not less then the number of days enterd for retention threshold for
                alerting. The Recommendation is to use at least twise the retention the threshold the default is set
                to 30 . the max posibile value is 180 days.

Compress storage message (CB):
               select this option to compress the message in the jms queue. compressing the message reduces disk
               space usage and network traffic.

Encrypt stored message (CB):
               select this option to encrypt the message in the jms queue.

Transfer Exchange Properties (CB) :
             -> you can select this option to also transfer the exchange propeties to the jms queue
             -> how ever we dont recommend using this option because headers and exchange propeties are subject to size
                restrictions which can result in problems or error.


this is for sizes and limits
---------------------------
Todo - https://community.sap.com/t5/technology-blogs-by-sap/cloud-integration-jms-resource-and-size-limits/ba-p/13322814


Cloud Integration - JMS Resource and Size Limits in SAP CPI
------------------------------------------------------------
JMS Resource and Size Limits in SAP Cloud Integration
In SAP Cloud Integration Enterprise Edition and SAP Integration Suite, JMS messaging resources are
limited and must be managed properly to ensure smooth operation.


Default Allocated Resources
----------------------------
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
--------------------------------------------------------------
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

For automated notifications when JMS resources reach critical levels, refer to the blog "Automated
Notification for Critical or Exhausted JMS Resources".


 */