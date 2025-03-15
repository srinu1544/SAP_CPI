package com.example.sap_cpi.XPath

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.sap_cpi.R
import com.example.sap_cpi.ui.theme.image.LoadImage

@Preview
@Composable
fun Image(){
    LoadImage(imageRes = R.drawable.xpath_axis_relationship)
}

/*

please refer - https://www.youtube.com/watch?v=f0oCvbuXmJI&t=2040s&ab_channel=HYRTutorials
use this for practice - https://www.hyrtutorials.com/p/add-padding-to-containers.html

Xpath
-----
10:14 Chapter 1 - Introduction
15:54 Chapter 2 - Types of XPath
29:38 Chapter 3 - XPath using Attributes
52:11 Chapter 4 - XPath Operators
01:09:11 Chapter 5 - XPath Conditions
01:25:37 Chapter 6 - XPath with Index
01:38:04 Chapter 7 - XPath Functions
02:10:06 Chapter 8 - XPath Axes
02:43:05 Chapter 9 - XPath Shortcuts
02:58:48 Chapter 10 - Third Party XPath Tools
03:26:31 Chapter 11 - Common Mistakes

Introduction
-------------
-> xpath (xml path language ) is a query language used to select nodes from an xml document or elements in HTMl web pages
-> Define by world wide web consortion (W3C)

diff bw xml and html

xml : we can provide user define tags
html : we can not provide user define tags, pre define tags on we can use.

Types of XPath
--------------
-> Absolute Xpath :
stars from the root element of the document
EX : /html/body/div[1]/div[3]/input

-> Relative Xpath :
starts from any point in the document based on the search criteria
Ex :  //input[@id='lable']

Absolute start with / (single forward slash)
Relative start with // (double forward slash)

note : in xpath index starts from 1

XPath using Attributes
-----------------------
we can identify nodes using attributes
Ex : //tagname[@attribute='value']


note : In XPath index starts with 1

xPath with operators
--------------------
=   equal to
!=  not equal to
<   less than
<=  less then or equals
>   greater than
>   greater than or equals

Xpath conditions
----------------
3 types
-> and
-> or
-> not

X path with index
-----------------
if their is no attributes we will go with index
//tagname[index]

note : In XPath index starts with 1
if you want to get data with index we can enclose with () braces and give the index like below then works perfect
(//td/tr)[2]

x path functions
----------------
6 types
-> text()
   //tagname[text()='signin']
-> contains
   //tagname[contains(text(),'signin')]
   //tagname[contains(@class,'signin')]
-> starts-with
    //tagname[starts-with(text(),'signin')]
   //tagname[starts-with(@class,'signin')]
-> normalize-spaces
   -> In element text or attribute values contains white space in start or end it will removes white spaces and find that then we can use normalize-space() function
   -> it cannot remove white spaces in between
   //tagname[normalize-space(text())='signin']
   //

-> last
   -> it gets the last index position
   //table[@id='containslist']/tbody/tr[last()]
-> position
     -> it works like index
     -> but we can write multiple conditions using position
     //table[@id='containslist']/tbody/tr[position()=2]
     //table[@id='containslist']/tbody/tr[position()>2] // this is the benefit of position

XPath with Axis (image reference to know)
----------------
-> with using Axis we can identify nodes with reference to other nodes
-> if you want use xpath axis we want to know relationship between nodes (reference and target)


*/