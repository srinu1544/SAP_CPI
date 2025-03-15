package com.example.sap_cpi.pallet_functions.Persistence

/*variables


what is variable
-----------------
In a program a variable is something you ust to store a piece of information by giving it a label (name)

They are two types of variables
--------------------------------
 Local variable :
-> it is tide to an one iflow , store data with in the iflow where it can be created.
-> it is used to share data with different steps.

Global variable
-> it is share data bw different iflows . it is share data bw in independent iflows.
-> if iflow is dependent if shares data to other iflow with the help of process direct adapter.
-> global variable only one to share data commonly with two different independent iflows.

 when do we use variables ?
-> variables are used usually to store a small piece of information
  ex : Tokens , Time stamp , date etc
-> they can be shared bw different iflows and bw different steps in a flow
-> They are used in situation where messages headers and exchange properties can not be used.


  general Recommendation
  ----------------------
-> prefer headers to share data across dependent iflow (process direct adapter)
-> prefer variables and data store to share data across independent iflows.
-> prefer exchange property to share data bw different steps of an iflow
     when there is only one exchange at play (no multicasting in the integration process)
-> prefer variables and data stores to share data bw different steps of an iflow when there are
      multiple exchange at play (multicasting is present in the integration process)




*/