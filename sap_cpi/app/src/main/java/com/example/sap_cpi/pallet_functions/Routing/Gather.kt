package com.example.sap_cpi.pallet_functions.Routing

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage

@Preview
@Composable
fun Gather() {
    Column {
        LoadImage(imageRes = R.drawable.gather1)
        LoadImage(imageRes = R.drawable.gather2)
    }
}

/* Gather :

-> if you want to gather the records  which got  multicast or which got split in cpi in to a single data is called gather
-> The Gather step merges messages from different routes (into a single message) with the option to define certain
strategies how to combine the initial messages.

config :
--------
TODO - https://help.sap.com/docs/cloud-integration/sap-cloud-integration/define-gather-and-join?q=gather
Incoming formats :

              -> Any
              -> Plain Text
              -> XML (Different format)
              -> XML (Same format)

Aggregation Algorithm  (DD):

              -> combine :
                  Combine (can only be selected if for Incoming Format you have selected XML (Same Format)
                   or XML (Different Format))
              -> combine at xpath :
                 Combine at XPath (can only be selected if for Incoming Format you have selected XML (Same Format))
                 Combine the incoming messages at the specified XPath.
                 Concatenate (can only be selected if for Incoming Format you have selected Plain Text)
                 concatenate the information from the different sources one after another.
              -> Tar :
                  Aggregates files to an archive (.tar) file.
              -> Zip :
                 Aggregates files to an archive (.zip) file.





*/

