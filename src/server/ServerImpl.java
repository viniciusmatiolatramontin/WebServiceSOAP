package server;
import java.util.ArrayList;

import javax.jws.WebService;

import controller.Controller;
import model.Estado;
import model.Pais;

@WebService(endpointInterface = "server.Server")
public class ServerImpl implements Server {
	
	Controller controller = new Controller();
	
	public void inserirPais(Pais p) {
		controller.inserirPais(p);
	}

	public void inserirEstado(int idPais, Estado e) {
		controller.inserirEstado(idPais, e);
	}

	public ArrayList<Pais> consultarPaises() {
		return controller.consultarPaises();
	}

	public ArrayList<Estado> consultarEstados(int idPais) {
		return controller.consultarEstados(idPais);
	}

	public Pais atualizarPais(int id, Pais p) {
		return controller.atualizarPais(id, p);
	}

	public Estado atualizarEstado(int idPais, int id, Estado e) {
		return controller.atualizarEstado(idPais, id, e);
	}
	
	public Pais deletarPais(int id) {
		return controller.deletarPais(id);
	}

	public Estado deletarEstado(int idPais, int id) {
		return controller.deletarEstado(idPais, id);
	}

}
