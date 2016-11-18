/**
 * Proveedor_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.proveedor;

public interface Proveedor_PortType extends java.rmi.Remote {
    public bancoabc.www.proveedor.ProveedorRespuesta agregarProveedor(bancoabc.www.proveedor.ProveedorRequest proveedor) throws java.rmi.RemoteException;
    public bancoabc.www.proveedor.ProveedorRespuesta consultarProvedor(bancoabc.www.proveedor.ProveedorRequest in) throws java.rmi.RemoteException;
    public bancoabc.www.proveedor.ProveedorRespuesta eliminarProveedor(bancoabc.www.proveedor.ProveedorRequest in) throws java.rmi.RemoteException;
    public bancoabc.www.proveedor.ProveedorRespuesta modificarProveedor(bancoabc.www.proveedor.ProveedorRequest in) throws java.rmi.RemoteException;
    public bancoabc.www.proveedor.ProveedorRespuesta asociarConvenio(bancoabc.www.proveedor.ProveedorRequest in) throws java.rmi.RemoteException;
}
