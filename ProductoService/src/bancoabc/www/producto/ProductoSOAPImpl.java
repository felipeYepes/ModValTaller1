/**
 * ProductoSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoSOAPImpl implements bancoabc.www.producto.ProductosPagoInterface{
    public bancoabc.www.producto.ConsultarProductosResponse consultarProductos(bancoabc.www.producto.ConsultarProductosRequest parametersReq) throws java.rmi.RemoteException {
      List <Producto>productos = new ArrayList<Producto>();
      ConsultarProductosResponse consultarProductosResponse = new ConsultarProductosResponse();
   	  ResultadoServicio resService = new ResultadoServicio();
   	  ProductoResponse productoResponse = new ProductoResponse();
     	  
   	  if("12345678".equals(parametersReq.getProductoRequest().getIdCliente())){
   		productos.add(new Producto("CC","34354540000401","Cuenta Corriente1",3000000));
   		productos.add(new Producto("CAH","34555800000001","Cuenta Corriente1",500000));
   		productos.add(new Producto("TC","22250000000159","Visa Platinium",12345678));
   		productos.add(new Producto("CAH","42424200000007","Cuenta Corriente1",0));
   		productos.add(new Producto("CC","23456500000760","Cuenta Corriente1",3000000));
   	  } else {

   		productos.add(new Producto("CC","42424200000007","Cuenta Corriente Otro",0));
   		productos.add(new Producto("CAH","23456500000760","Cuenta Ahorro Feliz",33200));
   	  }
   	  
   	  resService.setCodigo("OK");
   	  resService.setDescripcion("Listado Productos");
   	  productoResponse.setResultadoServicio(resService);
   	  productoResponse.setProductos(productos.toArray(new Producto[0]));
   	  consultarProductosResponse.setProductoResponse(productoResponse);
      return consultarProductosResponse;

    }

    public bancoabc.www.producto.ConsultaSaldoResponse consultaSaldo(bancoabc.www.producto.ConsultaSaldoRequest parametersSaldoReq) throws java.rmi.RemoteException {
        List <Producto>productos = new ArrayList<Producto>();
        ConsultaSaldoResponse consultarSaldo = new ConsultaSaldoResponse();
     	  ResultadoServicio resService = new ResultadoServicio();
     	  ProductoResponse productoResponse = new ProductoResponse();
     	  
       	  
     	  if("12345678".equals(parametersSaldoReq.getRequestSaldo().getIdCliente()) &&
     			 "34354540000401".equals(parametersSaldoReq.getRequestSaldo().getNumeroProducto())){
     		productos.add(new Producto("CC","34354540000401","Cuenta Corriente1",3000000));
     		  resService.setCodigo("OK");
         	  resService.setDescripcion("Saldo Producto");
 
     	  } else {

     		productos.add(new Producto("CC","42424200000007","Cuenta Corriente Otro",0));
     		resService.setCodigo("FAULT");
       	   resService.setDescripcion("FONDOS INSUFICIENTES");
     	  }
     	  
     	 
     	  productoResponse.setResultadoServicio(resService);
     	  productoResponse.setProductos(productos.toArray(new Producto[0]));
     	 consultarSaldo.setSaldosResponse(productoResponse);
        return consultarSaldo;
    }

}
