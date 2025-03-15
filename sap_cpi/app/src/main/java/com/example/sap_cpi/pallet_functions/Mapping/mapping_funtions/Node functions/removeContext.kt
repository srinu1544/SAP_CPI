package com.example.sap_cpi.pallet_functions.Mapping.mapping_funtions.Node

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage

@Preview
@Composable
fun RemoveContext(){
    Column {
        LoadImage(imageRes = R.drawable.remove_context)
    }
}

/*
 Remove context :
 ----------------
✅ Purpose:
Removes the context changes while keeping all values intact.
Converts multiple context levels into a flat list.

✅ When to Use:
When you want to remove hierarchy levels but keep all values.
When dealing with multiple occurrences of elements.

before remove context
Context 1: [Apple]
Context 2: [Orange]
Context 3: [Banana]

after remove context
[Apple, Orange, Banana]

Only the context breaks are removed, but all values remain.









 */
