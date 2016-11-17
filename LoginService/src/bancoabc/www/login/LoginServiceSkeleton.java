/**
 * LoginServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.login;

public class LoginServiceSkeleton implements bancoabc.www.login.LoginUsuarioInterface, org.apache.axis.wsdl.Skeleton {
    private bancoabc.www.login.LoginUsuarioInterface impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bancoabc/login/", "autenticarUsuarioRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.bancoabc/login/", ">autenticarUsuarioRequest"), bancoabc.www.login.AutenticarUsuarioRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("autenticarUsuario", _params, new javax.xml.namespace.QName("http://www.bancoabc/login/", "autenticarUsuarioResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.bancoabc/login/", ">autenticarUsuarioResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "autenticarUsuario"));
        _oper.setSoapAction("http://www.bancoabc/login/autenticarUsuario");
        _myOperationsList.add(_oper);
        if (_myOperations.get("autenticarUsuario") == null) {
            _myOperations.put("autenticarUsuario", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("autenticarUsuario")).add(_oper);
    }

    public LoginServiceSkeleton() {
        this.impl = new bancoabc.www.login.LoginServiceImpl();
    }

    public LoginServiceSkeleton(bancoabc.www.login.LoginUsuarioInterface impl) {
        this.impl = impl;
    }
    public bancoabc.www.login.AutenticarUsuarioResponse autenticarUsuario(bancoabc.www.login.AutenticarUsuarioRequest parameters) throws java.rmi.RemoteException
    {
        bancoabc.www.login.AutenticarUsuarioResponse ret = impl.autenticarUsuario(parameters);
        return ret;
    }

}
