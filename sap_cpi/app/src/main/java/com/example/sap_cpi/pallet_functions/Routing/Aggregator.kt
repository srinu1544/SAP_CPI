package com.example.sap_cpi.pallet_functions.Routing

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage


@Preview
@Composable
fun Aggregator() {
    Column {
        LoadImage(imageRes = R.drawable.aggregator1)
        LoadImage(imageRes = R.drawable.aggregator2)

    }

}


/*
Aggregator :
------------
You want to combine related individual messages so that they can be processed in bulk.
Using an Aggregator pattern, you can collect and store individual messages until a
complete set of related messages has been received. The aggregated message is then sent to the actual receiver.

aggregator strategies
---------------------
combine and combine in sequence

Use Case
--------
You want to collect individual product items related to the same order.
 The aggregated items are to be sent as one single order with multiple items.

imp points :
-----------
-> it is in the part of routing
-> it will supports only XML
-> it is not worked in exception subprocess and local integration process


*/