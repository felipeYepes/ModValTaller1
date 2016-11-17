/**
 * ValidarClienteServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.cliente;

public class ValidarClienteServiceLocator extends org.apache.axis.client.Service implements bancoabc.www.cliente.ValidarClienteService {

    public ValidarClienteServiceLocator() {
    }


    public ValidarClienteServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ValidarClienteServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ValidarClientePort
    private java.lang.String ValidarClientePort_address = "http://localhost:8080/ValidarClienteService/services/";

    public java.lang.String getValidarClientePortAddress() {
        return ValidarClientePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ValidarClientePortWSDDServiceName = "ValidarClientePort";

    public java.lang.String getValidarClientePortWSDDServiceName() {
        return ValidarClientePortWSDDServiceName;
    }

    public void setValidarClientePortWSDDServiceName(java.lang.String name) {
        ValidarClientePortWSDDServiceName = name;
    }

    public bancoabc.www.cliente.ValidaClienteInteface getValidarClientePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ValidarClientePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getValidarClientePort(endpoint);
    }

    public bancoabc.www.cliente.ValidaClienteInteface getValidarClientePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            bancoabc.www.cliente.ValidarClienteSOAPStub _stub = new bancoabc.www.cliente.ValidarClienteSOAPStub(portAddress, this);
            _stub.setPortName(getValidarClientePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setValidarClientePortEndpointAddress(java.lang.String address) {
        ValidarClientePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (bancoabc.www.cliente.ValidaClienteInteface.class.isAssignableFrom(serviceEndpointInterface)) {
                bancoabc.www.cliente.ValidarClienteSOAPStub _stub = new bancoabc.www.cliente.ValidarClienteSOAPStub(new java.net.URL(ValidarClientePort_address), this);
                _stub.setPortName(getValidarClientePortWSDDServiceName());
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
        if ("ValidarClientePort".equals(inputPortName)) {
            return getValidarClientePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.bancoabc/cliente/", "ValidarClienteService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.bancoabc/cliente/", "ValidarClientePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ValidarClientePort".equals(portName)) {
            setValidarClientePortEndpointAddress(address);
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
