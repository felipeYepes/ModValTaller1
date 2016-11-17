/**
 * FacturaService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.factura;

public interface FacturaService extends javax.xml.rpc.Service {
    public java.lang.String getfacturaSOAPAddress();

    public org.example.www.factura.FacturaInterface getfacturaSOAP() throws javax.xml.rpc.ServiceException;

    public org.example.www.factura.FacturaInterface getfacturaSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
