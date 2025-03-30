package com.example.sap_cpi.pallet_functions.process

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage

@Preview
@Composable
fun LocalIntegrationProcess(){
    LoadImage(imageRes = R.drawable.local_integration_process)
}

/*



Local Integration Process :
--------------------------
You use the local integration process to simplify your integration process. You can break down the main integration process
into smaller fragments by using local integration processes. You combine these fragments to achieve your main integration process.

You use the Local Integration Process to define an integration process that is specific to the integration
flow in which it is created. You can use this integration process with the Process Call step.

This is the component that allows you to define a subprocess  with an integration flow, when can be reused by
multiple process calls, you can use this component to modularize your integration  flow and reduce.
-> using a local integration process to define a common error handling logic that can be invoked by different
integration flows.

config :  (General, Processing)
-------
todo - https://help.sap.com/docs/cloud-integration/sap-cloud-integration/define-transaction-handling?q=local+integration+process

General (ET) :  name
------------

Processing (DD) :
        From calling Process
        Required for JDBC
        Required for JMS

 From calling process  :
     Transactional processing is inherited from the calling process. The value defined for the calling process is used as the timeout.

  Required for JDBC :
     	You can specify that Java Database Connectivity (JDBC) transactional database processing is applied (to ensure that
        the process is accomplished within one transaction).

        NOte : if select this time out DD will come the default time is 30 Min

   Required for JMS :
     	You can specify that Java Database Connectivity (JMS) transactional database processing is applied (to ensure that
        the process is accomplished within one transaction).

       NOte : if select this time out DD will come the default time is 30 Min

      note --  for time out read in integration process

      caution  : The maximum timeout setting is 12 hours.
                 It's recommended that the timeout setting doesn't exceed 1 hour
                 (because long running transactions can cause issues with the system database).
                 In future, transactions that take longer than 1 hour is stopped.





















*/

