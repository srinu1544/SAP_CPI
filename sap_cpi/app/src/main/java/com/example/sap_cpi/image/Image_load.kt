package com.example.sap_cpi.image

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun LoadImage(imageRes: Int) {
    Image(
        painter = painterResource(id = imageRes),
        contentDescription = "Drawable Image",
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .height(200.dp)
    )
}