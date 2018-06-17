/**
 * CalculatorCalculatorwebserviceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.calculatorimc.webservice;

public class CalculatorCalculatorwebserviceLocator extends org.apache.axis.client.Service implements org.calculatorimc.webservice.CalculatorCalculatorwebservice {

    public CalculatorCalculatorwebserviceLocator() {
    }


    public CalculatorCalculatorwebserviceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalculatorCalculatorwebserviceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CalculatorIMCEndPointPort
    private java.lang.String CalculatorIMCEndPointPort_address = "http://localhost:8080/CalculatorIMCWebService/calculator/calculatorwebservice";

    public java.lang.String getCalculatorIMCEndPointPortAddress() {
        return CalculatorIMCEndPointPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalculatorIMCEndPointPortWSDDServiceName = "CalculatorIMCEndPointPort";

    public java.lang.String getCalculatorIMCEndPointPortWSDDServiceName() {
        return CalculatorIMCEndPointPortWSDDServiceName;
    }

    public void setCalculatorIMCEndPointPortWSDDServiceName(java.lang.String name) {
        CalculatorIMCEndPointPortWSDDServiceName = name;
    }

    public org.calculatorimc.webservice.CalculatorIMCWebService getCalculatorIMCEndPointPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CalculatorIMCEndPointPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalculatorIMCEndPointPort(endpoint);
    }

    public org.calculatorimc.webservice.CalculatorIMCWebService getCalculatorIMCEndPointPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.calculatorimc.webservice.CalculatorCalculatorwebserviceSoapBindingStub _stub = new org.calculatorimc.webservice.CalculatorCalculatorwebserviceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCalculatorIMCEndPointPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalculatorIMCEndPointPortEndpointAddress(java.lang.String address) {
        CalculatorIMCEndPointPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.calculatorimc.webservice.CalculatorIMCWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                org.calculatorimc.webservice.CalculatorCalculatorwebserviceSoapBindingStub _stub = new org.calculatorimc.webservice.CalculatorCalculatorwebserviceSoapBindingStub(new java.net.URL(CalculatorIMCEndPointPort_address), this);
                _stub.setPortName(getCalculatorIMCEndPointPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CalculatorIMCEndPointPort".equals(inputPortName)) {
            return getCalculatorIMCEndPointPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.calculatorimc.org/", "calculator/calculatorwebservice");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.calculatorimc.org/", "CalculatorIMCEndPointPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CalculatorIMCEndPointPort".equals(portName)) {
            setCalculatorIMCEndPointPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
