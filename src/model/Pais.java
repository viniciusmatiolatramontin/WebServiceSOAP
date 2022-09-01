package model;

import java.util.Objects;

public class Pais {
	private String nome;
	private String idioma;
	private double IDH;
	private String climaPred;
	private int id;
	
	

	public Pais() {
		
	}
	
	public Pais(int id, String nome, String idioma, double IDH, String climaPred) {
		this.setId(id);
		this.setNome(nome);
		this.setIdioma(idioma);
		this.setIDH(IDH);
		this.setClimaPred(climaPred);
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome.isEmpty() || nome.equals(null)) {
			throw new IllegalArgumentException("Nome inválido, digite pelo menos um caracter!");
		}
		
		this.nome = nome;
	}
	
	public String getIdioma() {
		return idioma;
	}
	
	public void setIdioma(String idioma) {
		if(idioma.isEmpty() || idioma.equals(null)) {
			throw new IllegalArgumentException("Idioma inválido, digite pelo menos um caracter!");
		}
		
		this.idioma = idioma;
	}
	
	public double getIDH() {
		return IDH;
	}
	
	public void setIDH(double IDH) {
		if(IDH < 0 || IDH > 1) {
			throw new IllegalArgumentException("IDH inválido, digite um número entre zero e um!");
		}
		 this.IDH = IDH;
	}
	
	public String getClimaPred() {
		return climaPred;
	}
	
	public void setClimaPred(String climaPred) {
		if(climaPred.isEmpty() || climaPred.equals(null)) {
			throw new IllegalArgumentException("Clima predominante inválido, digite pelo menos um caracter!");
		}
		
		this.climaPred = climaPred;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		return Objects.equals(nome, other.nome);
	}
	
	
	
	
}
