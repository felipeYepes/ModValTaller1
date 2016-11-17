/**
 * ConvenioServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.convenio;

public class ConvenioServiceSkeleton implements bancoabc.www.convenio.ConvenioInterface, org.apache.axis.wsdl.Skeleton {
    private bancoabc.www.convenio.ConvenioInterface impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.bancoabc/convenio/", "consultaConveniosRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.bancoabc/convenio/", ">consultaConveniosRequest"), bancoabc.www.convenio.ConsultaConveniosRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("consultaConvenios", _params, new javax.xml.namespace.QName("http://www.bancoabc/convenio/", "consultaConveniosResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.bancoabc/convenio/", ">consultaConveniosResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "consultaConvenios"));
        _oper.setSoapAction("http://www.bancoabc/convenio/consultaConvenios");
        _myOperationsList.add(_oper);
        if (_myOperations.get("consultaConvenios") == null) {
            _myOperations.put("consultaConvenios", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("consultaConvenios")).add(_oper);
    }

    public ConvenioServiceSkeleton() {
        this.impl = new bancoabc.www.convenio.ConvenioServiceImpl();
    }

    public ConvenioServiceSkeleton(bancoabc.www.convenio.ConvenioInterface impl) {
        this.impl = impl;
    }
    public bancoabc.www.convenio.ConsultaConveniosResponse consultaConvenios(bancoabc.www.convenio.ConsultaConveniosRequest parametersRequest) throws java.rmi.RemoteException
    {
        bancoabc.www.convenio.ConsultaConveniosResponse ret = impl.consultaConvenios(parametersRequest);
        return ret;
    }

}
