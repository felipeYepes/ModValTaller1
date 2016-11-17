/**
 * ProductosPagoInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.producto;

public interface ProductosPagoInterface extends java.rmi.Remote {
    public bancoabc.www.producto.ConsultarProductosResponse consultarProductos(bancoabc.www.producto.ConsultarProductosRequest parametersReq) throws java.rmi.RemoteException;
    public bancoabc.www.producto.ConsultaSaldoResponse consultaSaldo(bancoabc.www.producto.ConsultaSaldoRequest parametersSaldoReq) throws java.rmi.RemoteException;
}
