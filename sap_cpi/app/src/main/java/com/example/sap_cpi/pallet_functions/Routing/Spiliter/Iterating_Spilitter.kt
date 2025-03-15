package com.example.sap_cpi.pallet_functions.Routing.Spiliter

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage

@Preview
@Composable
fun IteratingSplitter() {
    Column {
        LoadImage(imageRes = R.drawable.iterating_splitter1)
    }

}

/*
Iterating  Splitter
-------------------
The iterating splitter is used to split a message into multiple parts on an iterative process or loop
-> it enables the repeated execution of a specific process or sub flow for each item or record in the input message
-> it discards the main root element (enveloping element)





configure
----------
TODO - https://help.sap.com/docs/integration-suite/sap-integration-suite/define-iterating-splitter?q=Iterating+splitter+
Expression Type (DD):
                      Line Breaker
                      X path
                      Token
Token (ET) :
            it is visible only if select token

xpath expression (ET) :
                  -> it is visible only if select on xpath
                  -> input xpath
Grouping (ET) :
            -> input number
            -> the size of group into which the composite message is to be split
            -> for example , if a message has 10 nodes and grouping is defined as 2 the message is split into
               5 messages with 2 nodes each
Streaming (CB) :
            -> select this option if you want to stream the process of splitting a large composite messages into
             series of messages in small chunks

Parallel processing (CB) : (not maintain order in delivery)
                          -> select this check box if you want to enable (parallel)
                             processing of all the split messages at once

 Number of concurrent  process (ET) :
                          -> it visible only if select parallel processing
                          -> if you have select parallel processing the split messages are processed concurrently in threads
                              define how many concurrent processes to use in the splitter.
                              default is 10 , allowed 50.
Time out (ET) :
          -> It is visible if select parallel processing
          -> if the concurrent processing of the split messages does not respond in the specified time , the next elements
             in the aborted and the next elements in the sequence  flow are processed.
          -> default value is 300.

 stop on Exception (CB) :
                        -> you have the option to stop messages processing immediately if an exception occurs.
                        -> if you disable this option, message splitting and processing of the sub messages continues,
                          even if one of them fails.










*/