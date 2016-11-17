/**
 * LoginInterfaceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.login;

public class LoginInterfaceLocator extends org.apache.axis.client.Service implements bancoabc.www.login.LoginInterface {

    public LoginInterfaceLocator() {
    }


    public LoginInterfaceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LoginInterfaceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for loginSOAP
    private java.lang.String loginSOAP_address = "http://localhost:8080/LoginService/services/LoginService";

    public java.lang.String getloginSOAPAddress() {
        return loginSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String loginSOAPWSDDServiceName = "loginSOAP";

    public java.lang.String getloginSOAPWSDDServiceName() {
        return loginSOAPWSDDServiceName;
    }

    public void setloginSOAPWSDDServiceName(java.lang.String name) {
        loginSOAPWSDDServiceName = name;
    }

    public bancoabc.www.login.LoginUsuarioInterface getloginSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(loginSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getloginSOAP(endpoint);
    }

    public bancoabc.www.login.LoginUsuarioInterface getloginSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            bancoabc.www.login.LoginServiceStub _stub = new bancoabc.www.login.LoginServiceStub(portAddress, this);
            _stub.setPortName(getloginSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setloginSOAPEndpointAddress(java.lang.String address) {
        loginSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (bancoabc.www.login.LoginUsuarioInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                bancoabc.www.login.LoginServiceStub _stub = new bancoabc.www.login.LoginServiceStub(new java.net.URL(loginSOAP_address), this);
                _stub.setPortName(getloginSOAPWSDDServiceName());
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
        if ("loginSOAP".equals(inputPortName)) {
            return getloginSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.bancoabc/login/", "loginInterface");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.bancoabc/login/", "loginSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("loginSOAP".equals(portName)) {
            setloginSOAPEndpointAddress(address);
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
