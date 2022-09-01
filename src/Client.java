
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import model.Estado;
import model.Pais;
import server.Server;

import java.net.URL;

public class Client {
	  public static void main(String args[]) throws Exception {
	    URL url = new URL("http://127.0.0.1:9876/paises?wsdl");
	    QName qname = new QName("http://server/","ServerImplService");
	    Service ws = Service.create(url, qname);
	    Server webService = ws.getPort(Server.class);

	    Pais p1 = new Pais("Brasil", "Português", 0.765, "Tropical");
	    Pais p2 = new Pais("Russia", "Russo", 0.824, "Temperado");
	    Pais p3 = new Pais("India", "Hindi", 0.65, "Tropical de monsões");
	    Pais p4 = new Pais("China", "Mandarim", 0.758, "Monsões continentais");
	    Pais p5 = new Pais("Africa do Sul", "Africâner", 0.597, "Semiarido");
	    
	    webService.inserirPais(p1);
	    webService.inserirPais(p2);
	    webService.inserirPais(p3);
	    webService.inserirPais(p4);
	    webService.inserirPais(p5);
	    
	    Estado e1 = new Estado("Santa Catarina", "Sul", "Subtropical", 65.3);
	    Estado e2 = new Estado("Bahia", "Nordeste", "Tropical", 28.3);
	    Estado e3 = new Estado("Heilongjiang", "Nordeste", "Semiarido", 8);
	    Estado e4 = new Estado("Jilin", "Nordeste", "Semiarido", 140);
	    
	    webService.inserirEstado(0, e1);
	    webService.inserirEstado(0, e2);
	    
	    webService.inserirEstado(3, e3);
	    webService.inserirEstado(3, e4);
	    
	    System.out.println(webService.consultarPaises());
	    
	    for(Pais p : webService.consultarPaises()) {
	    	System.out.println(p.getNome());
	    	System.out.println(p.getIDH());
	    	System.out.println(p.getIdioma());
	    	System.out.println(p.getClimaPred());
	    	System.out.println("Estados: [");
		    for(Estado e : webService.consultarEstados(webService.consultarPaises().indexOf(p))) {
		    	System.out.println(e.getNome());
		    	System.out.println(e.getDensidadeDemo());
		    	System.out.println(e.getRegiao());
		    	System.out.println(e.getClimaPred());
		    }
	    	System.out.println("]");
	    	System.out.println("---------------------------------------------------------------------");
	    }
	  }
}
