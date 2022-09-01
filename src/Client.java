
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

	    Pais p1 = new Pais(1,"Brasil", "Português", 0.765, "Tropical");
	    Pais p2 = new Pais(2,"Russia", "Russo", 0.824, "Temperado");
	    Pais p3 = new Pais(3,"India", "Hindi", 0.65, "Tropical de monsões");
	    Pais p4 = new Pais(4,"China", "Mandarim", 0.758, "Monsões continentais");
	    Pais p5 = new Pais(5,"Africa do Sul", "Africâner", 0.597, "Semiarido");
	    
	    
	    webService.inserirPais(p1);
	    webService.inserirPais(p2);
	    webService.inserirPais(p3);
	    webService.inserirPais(p4);
	    webService.inserirPais(p5);
	
	    Estado e1 = new Estado(1,"Santa Catarina", "Sul", "Subtropical", 65.3, p1);
	    Estado e2 = new Estado(2,"Bahia", "Nordeste", "Tropical", 28.3,p1);
	    Estado e3 = new Estado(3,"Heilongjiang", "Nordeste", "Semiarido", 8,p4);
	    Estado e4 = new Estado(4,"Jilin", "Nordeste", "Semiarido", 140,p4);
	    
	    webService.inserirEstado(e1);
	    webService.inserirEstado(e2);
	    
	    webService.inserirEstado(e3);
	    webService.inserirEstado(e4);
	    
	    System.out.println(webService.consultarPaises());
	    System.out.println("---------------ESTADOS---------------");
	    System.out.println(webService.consultarEstados(1));
	    webService.deletarEstado(1); // del sc
	    webService.deletarPais(2); //deletar russia
	    System.out.println("---------------DEPOIS DE EXCLUIR---------------");
	    System.out.println(webService.consultarPaises());
	    System.out.println("---------------ESTADOS---------------");
	    System.out.println(webService.consultarEstados(1));
	    
	    e4.setNome("Sao Paulo");
	    webService.atualizarEstado(4,e4);
	    p1.setIDH(0.95);
	    webService.atualizarPais(1, p1);
	    
	    System.out.println("---------------DEPOIS DE EDITAR---------------");
	    System.out.println(webService.consultarPaises());
	    System.out.println("---------------ESTADOS---------------");
	    System.out.println(webService.consultarEstados(4));
	    
	  }
}
