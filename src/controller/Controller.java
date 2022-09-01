package controller;

import java.util.ArrayList;

import model.Estado;
import model.Pais;

public class Controller {
	private ArrayList<Pais> paises = new ArrayList<>();
	
	public void inserirPais(Pais p) {
		paises.add(p);
	}
	
	public ArrayList<Pais> consultarPaises() {
		return paises;
	}
	
	public Pais atualizarPais(int id, Pais p1) {
		paises.get(id).setNome(p1.getNome());
		paises.get(id).setIDH(p1.getIDH());
		paises.get(id).setIdioma(p1.getIdioma());
		paises.get(id).setClimaPred(p1.getClimaPred());
		
		for(Estado e : p1.getEstados()) {
			paises.get(id).addEstado(e);
		}
		
		return paises.get(id);
	}
	
	public Pais deletarPais(int id) {
		return paises.remove(id);
	}

	public void inserirEstado(int idPais, Estado e) {
		paises.get(idPais).addEstado(e);
	}
	
	public ArrayList<Estado> consultarEstados(int idPais) {
		return paises.get(idPais).getEstados();
	}
	
	public Estado atualizarEstado(int idPais, int id, Estado e) {
		paises.get(idPais).getEstados().get(id).setNome(e.getNome());
		paises.get(idPais).getEstados().get(id).setDensidadeDemo(e.getDensidadeDemo());
		paises.get(idPais).getEstados().get(id).setRegiao(e.getRegiao());
		paises.get(idPais).getEstados().get(id).setClimaPred(e.getClimaPred());

		return paises.get(idPais).getEstados().get(id);
	}
	
	public Estado deletarEstado(int idPais, int id) {
		return paises.get(idPais).getEstados().remove(id);
	}
}
