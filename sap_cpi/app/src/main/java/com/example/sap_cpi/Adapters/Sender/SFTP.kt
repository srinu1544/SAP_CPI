package com.example.sap_cpi.Adapters.Sender

/* SFTP (Secure file transport protocol)
-------------------------------------
The SFTP sender adapter connects an SAP Cloud Integration tenant to a remote system using the SSH File Transfer
protocol to read files from the system. SSH File Transfer protocol is also referred to as Secure File Transfer
protocol (or SFTP).

config  (General , source , processing , conditions, schedule)
-------
TODO - https://help.sap.com/docs/cloud-integration/sap-cloud-integration/configure-sftp-sender-adapter?q=SFTP+sender+adapter+
General :
--------
name

Source  :
  FILE ACCESS PARAMETERS (TF)

 Directory (ET) :
     In this you want to give sorce directory  path
     EX : /download
 Regex Filtering  (CB) :
    Select to evaluate the entered filename as a real regular expression.
     EX : Expressions, such as ab*, a.*, *a*, *a, ?b, and so on, are supported.
 File Name (ET) :
     In this want to give the file name
     EX : Spring.txt

 CONNECTION PARAMETERS (TF)
      Address (ET) :





















*/