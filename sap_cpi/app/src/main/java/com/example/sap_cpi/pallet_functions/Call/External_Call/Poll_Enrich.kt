package com.example.sap_cpi.pallet_functions.Call.External_Call

import android.graphics.drawable.Drawable
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage


@Preview
@Composable
fun composable() {
    Column {
        LoadImage(R.drawable.poll_enricher)
    }

}

/*
You can use the Poll Enrich to read (poll) messages from an external component
and add the content to the original message in the middle of the message
processing sequence.

-> it supports only SFTP adapter only, with sender participant only.
-> it is used to pick the file and send the file to next step
-> it is used for only received the files
-> it is used fot get the data from the SFTP only
-> if their requirement wants to get the dara from the SFTP folder in between
   the flow we can use the poll enrich
-> it will be connected to only sender system
-> one run one file only pull
->  this is mainly used for one extra file or message from sftp server.


when file pics
once the sender sends the data to the iflow (data process initiate) poll enrich
activate get the data from SFTP

config : (General , processing)
--------
TODO -  https://help.sap.com/docs/cloud-integration/sap-cloud-integration/define-poll-enrich?q=poll+enricher

Aggregation Algorithm (DD) :

Combine XML:
   Combines the message polled from the external component with the
   original message without any conditions. The messages are combined
   in multimapping format.

Concatenate:
    The message polled from the external component is added to the existing
    message.
Replace:
    The existing message is replaced with the message po

Throw Exception if no Message Found : (CB)
    -> Select this option to throw an exception in the message processing if no
    message is found. By default, this option is disabled.
   -> If you keep this option disabled, the header SAP_PollEnrichMessageFound
     is set to false and processing continues even if there’s no message.


Here we are using only  SFTP so here configuration of sftp adapter is different
SFTP ADAPTER :

config () :
TODO -- https://help.sap.com/docs/cloud-integration/sap-cloud-integration/configure-sftp-sender-adapter-used-with-poll-enrich-step?q=SFTP+poll+enrich






















*/