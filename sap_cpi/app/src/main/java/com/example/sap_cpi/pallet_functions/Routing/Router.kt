package com.example.sap_cpi.pallet_functions.Routing

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage

@Preview
@Composable
fun Router() {
    Column {
        LoadImage(imageRes = R.drawable.router)
        LoadImage(imageRes = R.drawable.router_path1)
        LoadImage(imageRes = R.drawable.router_expression_types)
    }

}


/*
Router :
--------

used to transfer the data to multiple systems based on some condition or used to transfer data to multiple paths based
on the condition

-> we unable to give the condition in router, for condition we  can click on the path and give the condition.
-> if click on router all paths related logic are shows

when  click on the particular path we have options

General and Process
===================

process
-------
-> Expression Type :  XML
                   NON-XML  (select one of these)

Examples  : NON-XML -
           ${header.location} = 'hyd'

           XML -
           //firstName = 'Ramoju'


-> condition :  (give the condition here)
-> default route  : (if you want check this check this box for default route)

if check default route means Expression and condition visibility will GONE


if you are using non xml some of conditions
=             ${header.SenderId} = '1'
!=            ${header.SenderId} != '1'
>             ${header.SenderId} > '1'
>=            ${header.SenderId} >= '1'
<             ${header.SenderId} < '1'
<=            ${header.SenderId} <= '1'
and           ${header.SenderId} = '1' and ${header.ReceiverId} = '2'
or            ${header.SenderId} = '1' or ${header.ReceiverId} = '2'
contains      ${header.SenderId} contains '1'
not contains  ${header.SenderId} not contains '1'
in            ${header.SenderId} in '1,2'
not in        ${header.SenderId} not in '1,2'
regex         ${header.SenderId} regex '1.*'
not regex     ${header.SenderId} not regex '1.*'


*/
