package com.example.sap_cpi.pallet_functions.Routing.Multicast

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage

@Preview
@Composable
fun ParallelMulticast() {
    LoadImage(imageRes = R.drawable.parallel_multicast)
}

/*

Note :  No configurations

parallel multicast :
--------------------
This is a message routing step that sends a copy of the same message to multiple routes at the same time.
you can use parallel multicast in scenarios where you need to perform multiple operations on the same message in parallel or
where the order of execution in not important.


*/
