package server;

import javax.jws.WebService;


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
	void inserirEstado(Estado e);

	@WebMethod
	String consultarPaises();

	@WebMethod
	String consultarEstados(int idPais);

	@WebMethod
	Pais atualizarPais(int id, Pais p);

	@WebMethod
	Estado atualizarEstado(int id, Estado e);

	@WebMethod
	Pais deletarPais(int id);

	@WebMethod
	Estado deletarEstado(int id);
}
