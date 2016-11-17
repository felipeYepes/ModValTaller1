/**
 * LoginInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.login;

public interface LoginInterface extends javax.xml.rpc.Service {
    public java.lang.String getloginSOAPAddress();

    public bancoabc.www.login.LoginUsuarioInterface getloginSOAP() throws javax.xml.rpc.ServiceException;

    public bancoabc.www.login.LoginUsuarioInterface getloginSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
