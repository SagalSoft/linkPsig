package linkpsig

import grails.transaction.Transactional

@Transactional
class PsigInterpreterService {

  def connect(){
  	withSoap(serviceURL: 'http://atgwebservices.atg.com.uy/PSIGServices/PSIGServicios.svc?wsdl') {
    	def response = send(SOAPAction: 'http://www.atg.com.uy/psig5.4/psig/IPSIG/Creditos') {
	      body {
	        Creditos(xmlns: 'http://www.atg.com.uy/psig5.4/psig') {
	          p_base('base')
	          p_codig('s')
	          p_esGrupo(true)
	          p_cont('MN')
	          p_fecha('2009-06-15T13:45:30')
	          p_hasta('2009-06-15T13:45:30')
	          Origen('IGMPRU')
	       	}
	     	}
    	}
   		println(response);
  	}
	}

	def test(){
			withSoap(serviceURL: 'http://atgwebservices.atg.com.uy/PSIGServices/PSIGServicios.svc?wsdl') {
    	def response = send(SOAPAction: 'http://www.atg.com.uy/psig5.4/psig/IPSIG/LoopBack') {
	      body {
	        LoopBack(xmlns: 'http://www.atg.com.uy/psig5.4/psig') {
	        /*Atributos si son necesarios*/ 
	        }

	     	}
    	}
   		println(response);
  	}
	}  

}
