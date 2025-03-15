package com.example.sap_cpi.pallet_functions.Routing.Multicast

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage

@Preview
@Composable
fun SequentialMulticast() {
    LoadImage(imageRes = R.drawable.sequential_multicast)
}



/*
Note :  No configurations only we can change  sequential order
        Select the branch which you want to move up or down in the order.
        Use Move Up and Move Down to change the order.


sequential multicast :
---------------------
This is a message routing step that sends a copy of the same message to multiple routes in a specific order.
you can use parallel multicast in scenarios where you need to perform multiple operations on the same message in parallel or
where the order of execution in important. it is used when one path dependent on another path
-> Only after the first path is finished (successfully or with an error), the second branch starts.*/