package com.example.sap_cpi.Files

/*
WSDL (Web Services Description Language) - Key Points
🔹 Definition: WSDL is an XML-based language used to describe web services and how they can be accessed.
🔹 Purpose: Defines the structure, operations, and communication format for SOAP-based web services.

It divides mainly two parts
1 ->
definitions
types
messages
operations
port type

2->
binding name
service

Key Components of WSDL

1️⃣ definitions ->  element is the root element of a WSDL file. It acts as a container for all the service definitions,
 including data types, messages, operations, bindings, and service endpoints.
1️⃣ Types → Defines data types using XSD (XML Schema Definition).
2️⃣ Message → Defines input/output message structure.
3️⃣ PortType → Describes available operations (functions) in the service.
4️⃣ Binding → Specifies protocols (SOAP, HTTP, etc.) and data format.
5️⃣ Service → Provides the service endpoint (URL) where the web service is available


basic example structure  :
---------------------------

<definitions name="MyService" targetNamespace="http://example.com/ws"
    xmlns="http://schemas.xmlsoap.org/wsdl/">

    <types>
        <schema xmlns="http://www.w3.org/2001/XMLSchema">
            <element name="Request" type="string"/>
        </schema>
    </types>

    <message name="InputMessage">
        <part name="request" element="tns:Request"/>
    </message>

    <portType name="MyPortType">
        <operation name="GetData">
            <input message="tns:InputMessage"/>
        </operation>
    </portType>

    <binding name="MyBinding" type="tns:MyPortType">
        <soap:binding style="document" transport="http://schemas.xmlsoap.org/soap/http"/>
    </binding>

    <service name="MyService">
        <port name="MyPort" binding="tns:MyBinding">
            <soap:address location="http://example.com/myService"/>
        </port>
    </service>
</definitions>


WSDL in SAP CPI :
-----------------
Used for SOAP Adapter configuration.
CPI can import WSDL to generate message mappings.
Supports synchronous & asynchronous communication.

Key Takeaways
✅ WSDL is used to describe and integrate SOAP web services.
✅ Defines operations, messages, and endpoints.
✅ Used in SAP CPI for SOAP-based integrations.




*/