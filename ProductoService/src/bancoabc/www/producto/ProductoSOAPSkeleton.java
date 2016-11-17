/**
 * ProductoSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.producto;

public class ProductoSOAPSkeleton implements bancoabc.www.producto.ProductosPagoInterface, org.apache.axis.wsdl.Skeleton {
    private bancoabc.www.producto.ProductosPagoInterface impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bancoabc/producto/", "consultarProductosRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.bancoabc/producto/", ">consultarProductosRequest"), bancoabc.www.producto.ConsultarProductosRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("consultarProductos", _params, new javax.xml.namespace.QName("http://www.bancoabc/producto/", "consultarProductosResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.bancoabc/producto/", ">consultarProductosResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "consultarProductos"));
        _oper.setSoapAction("http://www.bancoabc/producto/consultarProductos");
        _myOperationsList.add(_oper);
        if (_myOperations.get("consultarProductos") == null) {
            _myOperations.put("consultarProductos", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("consultarProductos")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bancoabc/producto/", "consultaSaldoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.bancoabc/producto/", ">consultaSaldoRequest"), bancoabc.www.producto.ConsultaSaldoRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("consultaSaldo", _params, new javax.xml.namespace.QName("http://www.bancoabc/producto/", "consultaSaldoResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.bancoabc/producto/", ">consultaSaldoResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "consultaSaldo"));
        _oper.setSoapAction("http://www.bancoabc/producto/consultaSaldo");
        _myOperationsList.add(_oper);
        if (_myOperations.get("consultaSaldo") == null) {
            _myOperations.put("consultaSaldo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("consultaSaldo")).add(_oper);
    }

    public ProductoSOAPSkeleton() {
        this.impl = new bancoabc.www.producto.ProductoSOAPImpl();
    }

    public ProductoSOAPSkeleton(bancoabc.www.producto.ProductosPagoInterface impl) {
        this.impl = impl;
    }
    public bancoabc.www.producto.ConsultarProductosResponse consultarProductos(bancoabc.www.producto.ConsultarProductosRequest parametersReq) throws java.rmi.RemoteException
    {
        bancoabc.www.producto.ConsultarProductosResponse ret = impl.consultarProductos(parametersReq);
        return ret;
    }

    public bancoabc.www.producto.ConsultaSaldoResponse consultaSaldo(bancoabc.www.producto.ConsultaSaldoRequest parametersSaldoReq) throws java.rmi.RemoteException
    {
        bancoabc.www.producto.ConsultaSaldoResponse ret = impl.consultaSaldo(parametersSaldoReq);
        return ret;
    }

}
