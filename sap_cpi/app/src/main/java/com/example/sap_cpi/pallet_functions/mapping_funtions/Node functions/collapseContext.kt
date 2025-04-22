package com.example.sap_cpi.pallet_functions.Mapping.mapping_funtions.Node

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage


@Preview
@Composable
fun CollapseContext(){
    Column {
        LoadImage(imageRes = R.drawable.collapse_context)
    }
}

/*

collapse context
----------------
taking only the first value from each context and merging them into a single context.

before collapse context
Context 1: [A, B, C]
Context 2: [D, E, F]
Context 3: [G, H, I]

after collapse context
Context 1: [A, D, G]
B, C, E, F, H, I are ignored.







*/

