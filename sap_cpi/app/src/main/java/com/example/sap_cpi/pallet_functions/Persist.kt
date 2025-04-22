package com.example.sap_cpi.pallet_functions


// help reference - https://help.sap.com/docs/cloud-integration/sap-cloud-integration/persist-messages?q=persist

/*Store a message so that you can access the stored message and analyze it at a later point in time

SAP CPI Persist Messages - వివరణ (తెలుగులో)
SAP Cloud Platform Integration (CPI) లో Persist Messages అంటే ఒక సందేశాన్ని (Message) భద్రపరచడం,
తదుపరి దశలో లేదా భవిష్యత్తులో విశ్లేషించడానికి ఉపయోగపడుతుంది.

📌 Persist Messages అంటే ఏమిటి?
ఒక ఇంటిగ్రేషన్ ఫ్లో (Integration Flow) లో Persist Step ను ఉపయోగించి సందేశాన్ని (Message) నిల్వ చేయవచ్చు.

ఇది ఆడిటింగ్ (Auditing) మరియు లాగింగ్ (Logging) కోసం ఉపయోగపడుతుంది.
సందేశం ఏదైనా ప్రత్యేక దశలో సురక్షితంగా స్టోర్ అవుతుంది.
SAP Cloud Integration OData API ద్వారా ఈ సందేశాలను తిరిగి పొందవచ్చు.
📌 Persist Messages ఉపయోగం ఏంటి?
📍 నియమాలు (Compliance Requirements) కి అనుగుణంగా:
మీ IT టీమ్ కి ఆడిటింగ్ కొరకు అవసరమైన సమాచారం అందించడానికి ఉపయోగపడుతుంది.

📍 సందేశపు స్వరూపాన్ని (Message State) భద్రపరచడం:

సందేశాన్ని ప్రారంభ దశలో స్టోర్ చేయడం (Sender System నుండి వచ్చిన డేటా స్టోర్ చేయవచ్చు).
సందేశాన్ని పంపే ముందు లేదా తర్వాత స్టోర్ చేయడం (Receiver System కి వెళ్లే ముందు సందేశాన్ని భద్రపరచవచ్చు).
📍 సందేశం ఎలా ట్రాన్సిట్ అయ్యిందో తెలుసుకోవడం:
ఏ సందేశం పంపించబడింది, ఏ సమయంలో దాని స్టేటస్ ఏమిటి అనేది ట్రాక్ చేయడానికి Persist Messages ఉపయోగపడుతుంది.

📌 Persist Messages ఎక్కడ నిల్వ అవుతాయి?
Persist Messages కోసం Message Store అనే లోజికల్ స్టోరేజ్ లొకేషన్ ఉంటుంది.

ఇది SAP CPI Tenant Database లోనే Data Store లాగా నిల్వ అవుతుంది.
మొత్తం 32 GB వరకు డేటాను స్టోర్ చేయవచ్చు.
User Interface ద్వారా ప్రత్యక్షంగా యాక్సెస్ చేయలేరు → OData API ద్వారా మాత్రమే సందేశాన్ని తిరిగి పొందవచ్చు.
📌 Persist Messages ఎలా పని చేస్తాయి? (ఉదాహరణ)
ఉదాహరణ:
ఉద్దేశ్యం:
ఒక SAP CPI Integration Flow లో సందేశాన్ని స్టోర్ చేయడం, ఆ తరువాత ఆ సందేశాన్ని తిరిగి విశ్లేషించడం.

స్టెప్స్:
1️⃣ Integration Flow మొదలైనప్పుడు Persist Step-1 లో సందేశాన్ని స్టోర్ చేయాలి.
2️⃣ మధ్యలో డేటా ప్రాసెస్ చేసిన తర్వాత Persist Step-2 లో స్టోర్ చేయాలి.
3️⃣ ఇది కావలసిన సమయంలో తిరిగి పొందడానికి OData API ద్వారా స్టోర్ చేసిన సందేశాన్ని యాక్సెస్ చేయవచ్చు.

📌 Persist Messages కు సంబంధించి ముఖ్యమైన విషయాలు
✅ సందేశాలు 30 రోజుల పాటు నిల్వ ఉంటాయి.
✅ OData API ద్వారా మాత్రమే సందేశాలను తిరిగి పొందవచ్చు.
✅ Message ID అవసరం – ప్రతి సందేశాన్ని తిరిగి పొందడానికి Message ID ద్వారా Retrieve చేయాలి.
✅ సమస్య రాబోతే డేటాబేస్ ఫుల్ అవకుండా నిరోధించబడుతుంది.
    ✅ సురక్షితంగా నిల్వ చేయడానికి AES 128-bit ఎన్క్రిప్షన్ ఉంటుంది.

📌 Persist Messages ఎలా Retrieve చేయాలి?
Persist Messages ను Cloud Integration OData API ద్వారా retrieve చేయవచ్చు.
🔹 API URL Format:

plaintext
Copy
Edit
https://<Cloud Integration Host>/api/v1/MessageProcessingLogs('<Message ID>')/MessageStoreEntries
🔹 ఉదాహరణ:

plaintext
Copy
Edit
https://mytenant.tmn.hci.eu1.hana.ondemand.com/api/v1/MessageProcessingLogs('ABCD-1234-EFG')/MessageStoreEntries
➡ Message ID ను Monitor Message Processing లో పొందవచ్చు.

📌 Persist Messages మరియు Error Handling
1️⃣ Error వచ్చినప్పుడు Messages Persist కావు → అదే సందేశం తిరిగి, తిరిగి స్టోర్ కాకుండా ఉండటానికి.
2️⃣ Message Processing Log (MPL) Attachments ను ఉపయోగించి Error Messages ను స్టోర్ చేయవచ్చు.
3️⃣ SAP CPI లో Circuit Breaker Mechanism ఉంది → MPL Attachments 1GB/24 గంటలు వరకు మాత్రమే నిల్వ చేయగలుగుతాయి.

📌 Persist Messages Step ఎలా జోడించాలి?
Step-by-Step Process:
1️⃣ SAP CPI Integration Flow లోకి వెళ్లి Persist Step ఎంచుకోండి.
2️⃣ సందేశాన్ని స్టోర్ చేయదగిన ప్రదేశంలో ఈ స్టెప్‌ను జోడించండి.
3️⃣ General Tab లో Persist Step కి పేరు ఇవ్వండి.
4️⃣ Processing Tab లో Step ID ను పేర్కొనండి.
5️⃣ Encrypt Stored Message ఆప్షన్ అవసరమైనట్లయితే ఉపయోగించండి.
6️⃣ Save చేసి Integration Flow Deploy చేయండి.

📌 ముఖ్యమైన API Calls
🔹 Message Store Entries Retrieve చేయడానికి:

plaintext
Copy
Edit
https://<Cloud Integration Host>/api/v1/MessageProcessingLogs('<Message ID>')/MessageStoreEntries
🔹 Stored Message Retrieve చేయడానికి:

plaintext
Copy
Edit
https://<Cloud Integration Host>/api/v1/MessageProcessingLogs('<Message Store ID>')/MessageContent
🔹 మేము Persist Messages ఎందుకు ఉపయోగిస్తాము?
✔ Audit మరియు Compliance అవసరాలకు ఉపయోగపడుతుంది.
✔ సందేశాలను ఏ దశలోనైనా స్టోర్ చేయవచ్చు.
✔ Error Handling మరియు Debugging లో సహాయపడుతుంది.
✔ Message Integrity Track చేయడానికి అవసరం.

📌 ముగింపు
SAP CPI లో Persist Messages అనేది ఒక శక్తివంతమైన లక్షణం, ఇది సందేశాల భద్రత, అనుసరణ (Compliance) మరియు విశ్లేషణ (Analysis) లో చాలా ఉపయోగపడుతుంది.
👉 మీ Integration Flows లో మీరు Persist Messages ను ఉపయోగించాలనుకుంటున్నారా? ఏమైనా స్నేహపూర్వక సహాయం కావాలా? 😃

*/