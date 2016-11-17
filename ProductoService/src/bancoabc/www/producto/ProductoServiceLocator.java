/**
 * ProductoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.producto;

public class ProductoServiceLocator extends org.apache.axis.client.Service implements bancoabc.www.producto.ProductoService {

    public ProductoServiceLocator() {
    }


    public ProductoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProductoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for productoSOAP
    private java.lang.String productoSOAP_address = "http://localhost:8080/ProductoService/services/productoSOAP";

    public java.lang.String getproductoSOAPAddress() {
        return productoSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String productoSOAPWSDDServiceName = "productoSOAP";

    public java.lang.String getproductoSOAPWSDDServiceName() {
        return productoSOAPWSDDServiceName;
    }

    public void setproductoSOAPWSDDServiceName(java.lang.String name) {
        productoSOAPWSDDServiceName = name;
    }

    public bancoabc.www.producto.ProductosPagoInterface getproductoSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(productoSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getproductoSOAP(endpoint);
    }

    public bancoabc.www.producto.ProductosPagoInterface getproductoSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            bancoabc.www.producto.ProductoSOAPStub _stub = new bancoabc.www.producto.ProductoSOAPStub(portAddress, this);
            _stub.setPortName(getproductoSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setproductoSOAPEndpointAddress(java.lang.String address) {
        productoSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (bancoabc.www.producto.ProductosPagoInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                bancoabc.www.producto.ProductoSOAPStub _stub = new bancoabc.www.producto.ProductoSOAPStub(new java.net.URL(productoSOAP_address), this);
                _stub.setPortName(getproductoSOAPWSDDServiceName());
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
        if ("productoSOAP".equals(inputPortName)) {
            return getproductoSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.bancoabc/producto/", "productoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.bancoabc/producto/", "productoSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("productoSOAP".equals(portName)) {
            setproductoSOAPEndpointAddress(address);
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
