/**
 * ConvenioServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.convenio;

import java.util.ArrayList;
import java.util.List;

public class ConvenioServiceImpl implements bancoabc.www.convenio.ConvenioInterface{
    public bancoabc.www.convenio.ConsultaConveniosResponse consultaConvenios(bancoabc.www.convenio.ConsultaConveniosRequest parametersRequest) throws java.rmi.RemoteException {
	  List <Convenio>convenios = new ArrayList<Convenio>();
	  ConsultaConveniosResponse conveniosResponse = new ConsultaConveniosResponse();
	  ConvenioRespuesta convenioRes = new ConvenioRespuesta();
	  RespuestaServicio resService = new RespuestaServicio();

  	  
	  if("12345678".equals(parametersRequest.getConvenioReq().getIdCliente())){
		  convenios.add(new Convenio("00000001","Factura Acueducto","1","18/11/2016"));
		  convenios.add(new Convenio("00000002","Factura Gas","1","17/11/2016"));
		  convenios.add(new Convenio("00000003","Factura CODENSA","1","19/11/2016"));
		  convenios.add(new Convenio("00000004","Factura ETB","1","20/11/2016"));
	  } else {

		  convenios.add(new Convenio("00000003","Factura CODENSA","441","19/11/2016"));
		  convenios.add(new Convenio("00000004","Factura ETB","233","20/11/2016"));
	  }
	  
	  resService.setCodigo("OK");
	  resService.setDescripcion("Listado Convenios");
	  convenioRes.setRespuestaServicio(resService);
	  convenioRes.setConvenios(convenios.toArray(new Convenio[0]));	
	  conveniosResponse.setConvenioResp(convenioRes);
      return conveniosResponse;
    }

}
