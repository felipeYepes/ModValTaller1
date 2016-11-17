/**
 * ValidarClienteSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.cliente;

import java.util.ArrayList;
import java.util.List;

public class ValidarClienteSOAPImpl implements bancoabc.www.cliente.ValidaClienteInteface{
    public bancoabc.www.cliente.RespuestaCliente validarCliente(bancoabc.www.cliente.ValidarClienteRequest parametersRequest) throws java.rmi.RemoteException {
    	RespuestaCliente resCliente = new RespuestaCliente();
    	ResultadoServicio resultadoServicio = new ResultadoServicio();
    	List <String> listCliente = new ArrayList();
    	listCliente.add("12345678");
    	listCliente.add("243434");
    	listCliente.add("3434");
    	listCliente.add("456343478");
    	if(listCliente.contains(parametersRequest.getValidaCliente().getIdCliente())){
    		resultadoServicio.setCodigo("OK");
        	resultadoServicio.setDescripcion("Usuario Existe como cliente");
        	resCliente.setClienteExiste(true);    		
    	} else {
    		resultadoServicio.setCodigo("FAIL");
        	resultadoServicio.setDescripcion("Usuario NO Existe como cliente");
        	resCliente.setClienteExiste(false);  
    	}
    	
    	resCliente.setEstadoServicio(resultadoServicio);    	
    	
    	return resCliente;
    }

}
