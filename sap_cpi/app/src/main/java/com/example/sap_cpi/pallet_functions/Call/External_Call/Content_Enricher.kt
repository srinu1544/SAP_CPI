package com.example.sap_cpi.pallet_functions.Call.External_Call

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage

@Preview
@Composable
fun ContentEnricher(){
    Column {
        LoadImage(imageRes = R.drawable.content_enricher)
        LoadImage(imageRes = R.drawable.content_enrich2)
    }
}

/*
Content Enricher :
------------------
This is a message transformation step that adds the content of a payload with the original message in the
course of a payload with the original message in the course of an integration process. This converts two
separate messages into a single enhanced payload. this feature enables you to make extract calls.
During an integration process to obtain additional data if any. you can choose between two aggregation strategies
ti enrich t=these tow payloads as a single message combine as enrich.

note : data enrich on the first data.

Config :
--------
TODO - https://help.sap.com/docs/cloud-integration/sap-cloud-integration/define-content-enricher?q=content+enricher
Aggregation Algorithm (DD) (combine) :

In the Processing tab, select an option for parameter Aggregation Algorithm.
There are the following options.

Combine :
Combines the original and lookup messages. You can't define any rules for combining messages.

Enrich :
You can define the path to node and key element based on which the original message is enriched with the lookup message.

ORIGINAL MESSAGE :
  Path to Node :
     Path to the reference node in the original message
  Key Element :
     Key element in the original message

LOOKUP MESSAGE :
  Path to Node :
     Path to the reference node in the lookup message
  Key Element :
     Key element in the lookup message

  here key element is must be same field value (common value)
  EX :  <EmployId>1<EmployId> original message
        <ProductId>1<ProductID> values must be same











*/

