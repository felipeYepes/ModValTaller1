/**
 * FacturaSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.factura;

public class FacturaSOAPSkeleton implements org.example.www.factura.FacturaInterface, org.apache.axis.wsdl.Skeleton {
    private org.example.www.factura.FacturaInterface impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.example.org/factura/", "obtenerListaFacturasRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.example.org/factura/", ">obtenerListaFacturasRequest"), org.example.www.factura.ObtenerListaFacturasRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("obtenerListaFacturas", _params, new javax.xml.namespace.QName("http://www.example.org/factura/", "obtenerListaFacturasResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.example.org/factura/", ">obtenerListaFacturasResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "obtenerListaFacturas"));
        _oper.setSoapAction("http://www.example.org/factura/obtenerListaFacturas");
        _myOperationsList.add(_oper);
        if (_myOperations.get("obtenerListaFacturas") == null) {
            _myOperations.put("obtenerListaFacturas", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("obtenerListaFacturas")).add(_oper);
    }

    public FacturaSOAPSkeleton() {
        this.impl = new org.example.www.factura.FacturaSOAPImpl();
    }

    public FacturaSOAPSkeleton(org.example.www.factura.FacturaInterface impl) {
        this.impl = impl;
    }
    public org.example.www.factura.ObtenerListaFacturasResponse obtenerListaFacturas(org.example.www.factura.ObtenerListaFacturasRequest parameters) throws java.rmi.RemoteException
    {
        org.example.www.factura.ObtenerListaFacturasResponse ret = impl.obtenerListaFacturas(parameters);
        return ret;
    }

}
