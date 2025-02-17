package com.example.sap_cpi.Groovys

import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.transform.OutputKeys
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult

// Input XML payload
def inputXml = message.getBody(string)

// Parse the XML using DocumentBuilder
def factory = DocumentBuilderFactory.newInstance()
factory.setNamespaceAware(true)
def builder = factory.newDocumentBuilder()
def document = builder.parse(new ByteArrayInputStream(inputXml.bytes))

// Get all <Record> nodes
def records = document.getElementsByTagName("Record")

// Filter records based on the criteria
def nodesToRemove = []
for (int i = 0; i < records.length; i++) {
    def record = records.item(i)
    def data1 = record.getElementsByTagName("Data1").item(0)?.textContent
    def data2 = record.getElementsByTagName("Data2").item(0)?.textContent

    // Check conditions: Data1 length >= 2 and Data2 is not blank
    if (data1.length() < 2 || data2.trim().isEmpty()) {
        nodesToRemove.add(record)
    }
}

// Remove non-matching nodes
nodesToRemove.each { record ->
    record.parentNode.removeChild(record)
}

// Convert the modified DOM back to an XML string
def transformer = TransformerFactory.newInstance().newTransformer()
transformer.setOutputProperty(OutputKeys.INDENT, "yes")
def result = new StringWriter()
transformer.transform(new DOMSource(document), new StreamResult(result))

// Set the filtered XML as the message body
message.setBody(result.toString())
return message

