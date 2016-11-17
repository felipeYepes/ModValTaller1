/**
 * LoginServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.login;

public class LoginServiceImpl implements bancoabc.www.login.LoginUsuarioInterface{
    public bancoabc.www.login.AutenticarUsuarioResponse autenticarUsuario(bancoabc.www.login.AutenticarUsuarioRequest parameters) throws java.rmi.RemoteException {
    	EstadoServicio estado;
    	AutenticarRespuesta res;
    	AutenticarUsuarioResponse response;
    	if("12345678".equals(parameters.getRespuestaAutenticacion().getIdUser().toString()) && 
    		"1234".equals(parameters.getRespuestaAutenticacion().getPassword().toString())){
   		
	        estado = new EstadoServicio("0", "Autenticacion Exitosa");
	        res = new AutenticarRespuesta("true", estado);
    	}else {
    		estado = new EstadoServicio("3", "Usuario o Clave invalido");
	        res = new AutenticarRespuesta("false", estado);
    	}
	        response = new AutenticarUsuarioResponse(res);
        return response; 
    }

}
