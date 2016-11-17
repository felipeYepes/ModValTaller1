/**
 * FacturaSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.factura;

import java.util.ArrayList;
import java.util.List;

public class FacturaSOAPImpl implements org.example.www.factura.FacturaInterface{
    public org.example.www.factura.ObtenerListaFacturasResponse obtenerListaFacturas(org.example.www.factura.ObtenerListaFacturasRequest parameters) throws java.rmi.RemoteException {
        
  	  List <Factura>facturas = new ArrayList<Factura>();
  	  
  	  facturas.add(new Factura("1",0, "Factura Acueducto"));
	  facturas.add(new Factura("2",0, "Factura Gas"));
	  facturas.add(new Factura("3",0, "Factura CODENSA"));
	  facturas.add(new Factura("4",0, "Factura ETB"));
	  
	  ObtenerListaFacturasResponse response = new ObtenerListaFacturasResponse();
      RespuestaFactura resp =new RespuestaFactura();
      RespuestaServicio resServicio = new RespuestaServicio();
      resServicio.setCodigo("OK");
      resServicio.setDescripcion("Listado Facturas");
      resp.setRespuestaServicio(resServicio);
      resp.setFacturas(facturas.toArray(new Factura[0]));	
      response.setRespuestaFactura(resp);
      return response;

    }

}
