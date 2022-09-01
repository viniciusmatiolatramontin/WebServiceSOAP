package server;

import javax.jws.WebService;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import model.Estado;
import model.Pais;

@WebService
@SOAPBinding(style = Style.RPC)
public interface Server {
	@WebMethod
	void inserirPais(Pais p);

	@WebMethod
	void inserirEstado(int idPais, Estado e);

	@WebMethod
	ArrayList<Pais> consultarPaises();

	@WebMethod
	ArrayList<Estado> consultarEstados(int idPais);

	@WebMethod
	Pais atualizarPais(int id, Pais p);

	@WebMethod
	Estado atualizarEstado(int idPais, int id, Estado e);

	@WebMethod
	Pais deletarPais(int id);

	@WebMethod
	Estado deletarEstado(int idPais, int id);
}
