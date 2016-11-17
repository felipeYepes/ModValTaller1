/**
 * ProductoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.producto;

public interface ProductoService extends javax.xml.rpc.Service {
    public java.lang.String getproductoSOAPAddress();

    public bancoabc.www.producto.ProductosPagoInterface getproductoSOAP() throws javax.xml.rpc.ServiceException;

    public bancoabc.www.producto.ProductosPagoInterface getproductoSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
