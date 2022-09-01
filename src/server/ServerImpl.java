package server;

import java.util.HashMap;

import javax.jws.WebService;

import model.Estado;
import model.Pais;

@WebService(endpointInterface = "server.Server")
public class ServerImpl implements Server {
	private HashMap<Integer,Pais> paises = new HashMap<>();
	private static HashMap<Integer, Estado> estados = new HashMap<>();

	public void inserirPais(Pais p) {
		if(paises.containsKey(p.getId())){
			throw new IllegalArgumentException("Id já existente, não foi possível inserir país");
		}
		paises.put(p.getId(), p);
	}

	public String consultarPaises() {
		String msg = "";
		for (Pais p : paises.values()) {
			msg += "País:" + p.getNome() + "\nIdioma:" + p.getIdioma() + "\nIDH: " + p.getIDH()
					+ "\nClima Predominante: " + p.getClimaPred() + "\n" + "\n";
		}
		return msg;
	}

	public Pais atualizarPais(int id, Pais p1) {
		paises.get(id).setNome(p1.getNome());
		paises.get(id).setIDH(p1.getIDH());
		paises.get(id).setIdioma(p1.getIdioma());
		paises.get(id).setClimaPred(p1.getClimaPred());

		return paises.get(id);
	}

	public Pais deletarPais(int id) {
		return paises.remove(id);
	}

	public void inserirEstado(Estado e) {
		if(estados.containsKey(e.getId())){
			throw new IllegalArgumentException("Id já existente, não foi possível inserir estado");
		}
		estados.put(e.getId(), e);
	}

	public String consultarEstados(int idPais) {
		String msg = "";
		for (Estado e : estados.values()) {
			if (e.getPais().equals(paises.get(idPais))) {
				msg += "Estado:" + e.getNome() + "\nPaís:" + e.getPais().getNome()+ "\nRegião:" + e.getRegiao() + "\nClima Predominante: "
						+ e.getClimaPred() + "\nDensidade Demográfica: " + e.getDensidadeDemo() + "\n" + "\n";
			}
		}
		return msg;
	}

	public Estado atualizarEstado(int id, Estado e) {
		estados.get(id).setNome(e.getNome());
		estados.get(id).setDensidadeDemo(e.getDensidadeDemo());
		estados.get(id).setRegiao(e.getRegiao());
		estados.get(id).setClimaPred(e.getClimaPred());

		return estados.get(id);
	}

	public Estado deletarEstado(int id) {
		return estados.remove(id);
	}
}
