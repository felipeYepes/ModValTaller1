/**
 * ProveedorSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.proveedor;

public class ProveedorSOAPSkeleton implements bancoabc.www.proveedor.Proveedor_PortType, org.apache.axis.wsdl.Skeleton {
    private bancoabc.www.proveedor.Proveedor_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "proveedor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "proveedorRequest"), bancoabc.www.proveedor.ProveedorRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("agregarProveedor", _params, new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "out"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "ProveedorRespuesta"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "AgregarProveedor"));
        _oper.setSoapAction("http://www.bancoabc/proveedor/AgregarProveedor");
        _myOperationsList.add(_oper);
        if (_myOperations.get("agregarProveedor") == null) {
            _myOperations.put("agregarProveedor", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("agregarProveedor")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "in"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "proveedorRequest"), bancoabc.www.proveedor.ProveedorRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("consultarProvedor", _params, new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "out"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "ProveedorRespuesta"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "consultarProvedor"));
        _oper.setSoapAction("http://www.bancoabc/proveedor/consultarProvedor");
        _myOperationsList.add(_oper);
        if (_myOperations.get("consultarProvedor") == null) {
            _myOperations.put("consultarProvedor", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("consultarProvedor")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "in"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "proveedorRequest"), bancoabc.www.proveedor.ProveedorRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("eliminarProveedor", _params, new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "out"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "ProveedorRespuesta"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "EliminarProveedor"));
        _oper.setSoapAction("http://www.bancoabc/proveedor/EliminarProveedor");
        _myOperationsList.add(_oper);
        if (_myOperations.get("eliminarProveedor") == null) {
            _myOperations.put("eliminarProveedor", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("eliminarProveedor")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "in"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "proveedorRequest"), bancoabc.www.proveedor.ProveedorRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("modificarProveedor", _params, new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "out"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "ProveedorRespuesta"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "ModificarProveedor"));
        _oper.setSoapAction("http://www.bancoabc/proveedor/ModificarProveedor");
        _myOperationsList.add(_oper);
        if (_myOperations.get("modificarProveedor") == null) {
            _myOperations.put("modificarProveedor", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("modificarProveedor")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "in"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "proveedorRequest"), bancoabc.www.proveedor.ProveedorRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("asociarConvenio", _params, new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "out"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "ProveedorRespuesta"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "asociarConvenio"));
        _oper.setSoapAction("http://www.bancoabc/proveedor/asociarConvenio");
        _myOperationsList.add(_oper);
        if (_myOperations.get("asociarConvenio") == null) {
            _myOperations.put("asociarConvenio", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("asociarConvenio")).add(_oper);
    }

    public ProveedorSOAPSkeleton() {
        this.impl = new bancoabc.www.proveedor.ProveedorSOAPImpl();
    }

    public ProveedorSOAPSkeleton(bancoabc.www.proveedor.Proveedor_PortType impl) {
        this.impl = impl;
    }
    public bancoabc.www.proveedor.ProveedorRespuesta agregarProveedor(bancoabc.www.proveedor.ProveedorRequest proveedor) throws java.rmi.RemoteException
    {
        bancoabc.www.proveedor.ProveedorRespuesta ret = impl.agregarProveedor(proveedor);
        return ret;
    }

    public bancoabc.www.proveedor.ProveedorRespuesta consultarProvedor(bancoabc.www.proveedor.ProveedorRequest in) throws java.rmi.RemoteException
    {
        bancoabc.www.proveedor.ProveedorRespuesta ret = impl.consultarProvedor(in);
        return ret;
    }

    public bancoabc.www.proveedor.ProveedorRespuesta eliminarProveedor(bancoabc.www.proveedor.ProveedorRequest in) throws java.rmi.RemoteException
    {
        bancoabc.www.proveedor.ProveedorRespuesta ret = impl.eliminarProveedor(in);
        return ret;
    }

    public bancoabc.www.proveedor.ProveedorRespuesta modificarProveedor(bancoabc.www.proveedor.ProveedorRequest in) throws java.rmi.RemoteException
    {
        bancoabc.www.proveedor.ProveedorRespuesta ret = impl.modificarProveedor(in);
        return ret;
    }

    public bancoabc.www.proveedor.ProveedorRespuesta asociarConvenio(bancoabc.www.proveedor.ProveedorRequest in) throws java.rmi.RemoteException
    {
        bancoabc.www.proveedor.ProveedorRespuesta ret = impl.asociarConvenio(in);
        return ret;
    }

}
