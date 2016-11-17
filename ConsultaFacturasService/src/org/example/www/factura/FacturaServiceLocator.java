/**
 * FacturaServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.factura;

public class FacturaServiceLocator extends org.apache.axis.client.Service implements org.example.www.factura.FacturaService {

    public FacturaServiceLocator() {
    }


    public FacturaServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FacturaServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for facturaSOAP
    private java.lang.String facturaSOAP_address = "http://localhost:8080/ConsultaFacturaService/services/FacturaPort";

    public java.lang.String getfacturaSOAPAddress() {
        return facturaSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String facturaSOAPWSDDServiceName = "facturaSOAP";

    public java.lang.String getfacturaSOAPWSDDServiceName() {
        return facturaSOAPWSDDServiceName;
    }

    public void setfacturaSOAPWSDDServiceName(java.lang.String name) {
        facturaSOAPWSDDServiceName = name;
    }

    public org.example.www.factura.FacturaInterface getfacturaSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(facturaSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getfacturaSOAP(endpoint);
    }

    public org.example.www.factura.FacturaInterface getfacturaSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.example.www.factura.FacturaSOAPStub _stub = new org.example.www.factura.FacturaSOAPStub(portAddress, this);
            _stub.setPortName(getfacturaSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setfacturaSOAPEndpointAddress(java.lang.String address) {
        facturaSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.example.www.factura.FacturaInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                org.example.www.factura.FacturaSOAPStub _stub = new org.example.www.factura.FacturaSOAPStub(new java.net.URL(facturaSOAP_address), this);
                _stub.setPortName(getfacturaSOAPWSDDServiceName());
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
        if ("facturaSOAP".equals(inputPortName)) {
            return getfacturaSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.example.org/factura/", "FacturaService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.example.org/factura/", "facturaSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("facturaSOAP".equals(portName)) {
            setfacturaSOAPEndpointAddress(address);
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
