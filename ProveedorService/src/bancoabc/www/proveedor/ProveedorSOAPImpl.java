/**
 * ProveedorSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.proveedor;

public class ProveedorSOAPImpl implements bancoabc.www.proveedor.Proveedor_PortType{
    public bancoabc.www.proveedor.ProveedorRespuesta agregarProveedor(bancoabc.www.proveedor.ProveedorRequest proveedor) throws java.rmi.RemoteException {
    	ProveedorRespuesta res= new ProveedorRespuesta();
    	res.setProveedores(new Proveedor[0]);
    	RespuestaServicio resSer = new RespuestaServicio();
    	resSer.setCodigo("OK");
    	resSer.setDescripcion("Provedor Creado");
    	res.setRespuesta(resSer);
    	return res;
    }

    public bancoabc.www.proveedor.ProveedorRespuesta consultarProvedor(bancoabc.www.proveedor.ProveedorRequest in) throws java.rmi.RemoteException {
    	ProveedorRespuesta res= new ProveedorRespuesta();
    	res.setProveedores(new Proveedor[0]);
    	RespuestaServicio resSer = new RespuestaServicio();
    	resSer.setCodigo("OK");
    	resSer.setDescripcion("Provedor Consultado");
    	res.setRespuesta(resSer);
    	return res;
    }

    public bancoabc.www.proveedor.ProveedorRespuesta eliminarProveedor(bancoabc.www.proveedor.ProveedorRequest in) throws java.rmi.RemoteException {
    	ProveedorRespuesta res= new ProveedorRespuesta();
    	res.setProveedores(new Proveedor[0]);
    	RespuestaServicio resSer = new RespuestaServicio();
    	resSer.setCodigo("OK");
    	resSer.setDescripcion("Provedor Eliminado");
    	res.setRespuesta(resSer);
    	return res;
    }

    public bancoabc.www.proveedor.ProveedorRespuesta modificarProveedor(bancoabc.www.proveedor.ProveedorRequest in) throws java.rmi.RemoteException {
    	ProveedorRespuesta res= new ProveedorRespuesta();
    	res.setProveedores(new Proveedor[0]);
    	RespuestaServicio resSer = new RespuestaServicio();
    	resSer.setCodigo("OK");
    	resSer.setDescripcion("Provedor Modificado");
    	res.setRespuesta(resSer);
    	return res;
    }

    public bancoabc.www.proveedor.ProveedorRespuesta asociarConvenio(bancoabc.www.proveedor.ProveedorRequest in) throws java.rmi.RemoteException {
    	ProveedorRespuesta res= new ProveedorRespuesta();
    	res.setProveedores(new Proveedor[0]);
    	RespuestaServicio resSer = new RespuestaServicio();
    	resSer.setCodigo("OK");
    	resSer.setDescripcion("Convenio Actualizado");
    	res.setRespuesta(resSer);
    	return res;
    }

}
