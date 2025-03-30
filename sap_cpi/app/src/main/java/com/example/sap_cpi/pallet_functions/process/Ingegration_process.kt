package com.example.sap_cpi.pallet_functions.process

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage


@Preview
@Composable
fun IntegationProcee(){
    LoadImage(imageRes = R.drawable.integration_process)
}

/*

 Integration Process
 --------------------
 This is the component that allows you to define the main process of your integration flow, which contains the sender,
 receiver and other flow element , you can use this component to orchestrate the message processing logic and and
 call other integration flow or local integration.

-> using an integration process to define the main flow of your integration scenario and call a local integration process
or another integration flow using the process direct adapter.


 config : (General , Processing )
 TODO - https://help.sap.com/docs/cloud-integration/sap-cloud-integration/define-integration-processes?q=integration+process

 General : name
 ---------------
 Processing :
 ------------
 TRANSACTION MANAGEMENT (TV)
 Transaction handling (DD)
      Not Required
      Required for JDBC
      Required for JMS


Transaction Handling in SAP CPI
Transaction management ensures data consistency when dealing with JMS (Java Message Service) or JDBC (Database) operations.

Options Available:
Not Required

No transaction handling is enforced.
Used for normal integration flows where transaction rollback or commit is not needed.
Required for JDBC

Ensures database operations (Insert, Update, Delete) are handled within a transaction.
If the flow fails, all JDBC operations rollback automatically.
Required for JMS

Used when working with JMS queues for message processing.
Ensures messages are either fully processed or rolled back in case of failure.
When to Use Which Option?
✅ Use "Not Required" → If your flow does not use JDBC or JMS.
✅ Use "Required for JDBC" → If you have database (JDBC) operations and want transaction control.
✅ Use "Required for JMS" → If using JMS queues and need reliable message delivery.

 NOte : if select this time out DD will come the default time is 30 Min

      note --  for time out read in integration process

      caution  : The maximum timeout setting is 12 hours.
                 It's recommended that the timeout setting doesn't exceed 1 hour
                 (because long running transactions can cause issues with the system database).
                 In future, transactions that take longer than 1 hour is stopped.


SAP CPI లో Transactional Processing అంటే ఏమిటి?
Transactional processing అనేది ఒక ఇంటిగ్రేషన్ ప్రాసెస్ లో ఉన్న అడుగులు (steps) అన్ని ఒకే ట్రాన్సాక్షన్ లో ప్రాసెస్ అవుతాయి అనే అర్థం.

ఉదాహరణ:
ఒక Data Store Write ఆపరేషన్ ఉన్న ప్రాసెస్ ను పరిగణించండి.

1️⃣ Transaction Handling Active (సక్రియం):
ఇంటిగ్రేషన్ ఫ్లో పూర్తిగా విజయవంతమైతే మాత్రమే Data Store entry (డేటా స్టోర్ లో డేటా) సేవ్ అవుతుంది.
ఎలాంటి పొరపాటు (error) జరిగినా, ట్రాన్సాక్షన్ రద్దు (rollback) అవుతుంది మరియు డేటా స్టోర్ లో ఎంట్రీ రాయబడదు.

2️⃣ Transaction Handling Inactive (నిష్క్రియం):
Data Store entry ప్రాసెస్ స్టెప్ ఎగ్జిక్యూట్ అయిన వెంటనే (immediately) కమిట్ అవుతుంది.
ఎర్రర్ జరిగినా కూడా, డేటా స్టోర్ లో డేటా సేవ్ అవుతుంది, కానీ రద్దు (rollback) కాదు.
📌 ముఖ్యమైన విషయం:
👉 Transaction Active అయితే – డేటా సురక్షితంగా ప్రాసెస్ అవుతుంది, పొరపాటు అయితే రద్దు (rollback) అవుతుంది.
👉 Transaction Inactive అయితే – పొరపాటు జరిగినా కూడా డేటా స్టోర్ లో నిల్వ (persist) అవుతుంది.

💡 ఇది ముఖ్యంగా బ్యాంకింగ్, ఆర్ధిక లావాదేవీలు మరియు క్రిటికల్ డేటా హ్యాండ్లింగ్ లో ఉపయోగపడుతుంది. 🚀

SAP CPI లో Timeout అంటే ఏమిటి?
Timeout అనేది ఒక integration process లోని operation (step) execution కోసం ఇచ్చిన గరిష్ట సమయం.

📌 Timeout కి ముఖ్యమైన సందర్భాలు:
1️⃣ API లేదా Backend System Response Timeout

CPI నుండి API లేదా backend system కు request పంపినప్పుడు, కొన్ని సెకన్లలో response రావాలి.
Timeout అర్థం: సpecified time లో response రాకపోతే process fail అవుతుంది.
2️⃣ Transactional Processing లో Timeout

ఒక transaction లో step execution ఎంత సమయం వేచి చూడాలో నిర్ణయించడానికి timeout ఉపయోగిస్తారు.
ఉదాహరణ: Data Store Write operation ఒక transaction లో ఉన్నప్పుడు, transaction పూర్తయ్యేలోపు (timeout లోపు) response రాకపోతే transaction rollback అవుతుంది.
3️⃣ Queue Processing & Asynchronous Integration Timeout

CPIలో JMS queues, asynchronous calls లో message delivery కోసం timeout ఉంటుంది.
ఒకసారి timeout అయితే, message discard అవ్వొచ్చు లేదా retry mechanism depend అవుతుంది.
🔹 Timeout Practical Example:
👉 REST API Call:

ఒక integration flow external REST API కి call చేస్తుంది.
API లో response కోసం 30 seconds time limit ఇచ్చారు.
API response 30 secs లో రాకపోతే, CPI timeout error వస్తుంది.
👉 Database Transaction:

CPI SAP HANA DB లో data insert చేస్తుంది.
Transaction timeout 60 seconds గా సెటప్ చేశారు.
60 secs లో insert process పూర్తికాకపోతే, transaction rollback అవుతుంది.
✅ Timeout Issues ఎలా Handle చేయాలి?
Retry Mechanism – API లేదా backend response slow అయితే, retry logic ఉపయోగించాలి.
Increase Timeout – CPIలో HTTP, SOAP, OData adapters లో timeout properties ను మార్చి ఎక్కువ గరిష్ట సమయం ఇవ్వాలి.
Queue Processing – Large data processing కు JMS queues ఉపయోగించి asynchronous processing చేయాలి.
💡 Final Thought: Timeout సమయం ముగిసిన తర్వాత process fail అవ్వడానికి ముందు CPI ఎంత సేపు wait చేయాలో నిర్ణయిస్తుంది. 🚀 





*/