/**
 * ValidarClienteSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.cliente;

public class ValidarClienteSOAPSkeleton implements bancoabc.www.cliente.ValidaClienteInteface, org.apache.axis.wsdl.Skeleton {
    private bancoabc.www.cliente.ValidaClienteInteface impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bancoabc/cliente/", "validarClienteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.bancoabc/cliente/", ">validarClienteRequest"), bancoabc.www.cliente.ValidarClienteRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("validarCliente", _params, new javax.xml.namespace.QName("http://www.bancoabc/cliente/", "validarClienteResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.bancoabc/cliente/", "RespuestaCliente"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "validarCliente"));
        _oper.setSoapAction("http://www.bancoabc/cliente/validarCliente");
        _myOperationsList.add(_oper);
        if (_myOperations.get("validarCliente") == null) {
            _myOperations.put("validarCliente", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("validarCliente")).add(_oper);
    }

    public ValidarClienteSOAPSkeleton() {
        this.impl = new bancoabc.www.cliente.ValidarClienteSOAPImpl();
    }

    public ValidarClienteSOAPSkeleton(bancoabc.www.cliente.ValidaClienteInteface impl) {
        this.impl = impl;
    }
    public bancoabc.www.cliente.RespuestaCliente validarCliente(bancoabc.www.cliente.ValidarClienteRequest parametersRequest) throws java.rmi.RemoteException
    {
        bancoabc.www.cliente.RespuestaCliente ret = impl.validarCliente(parametersRequest);
        return ret;
    }

}
