package model;

import java.util.Objects;

public class Estado {
	private String nome;
	private Pais pais;
	private String regiao;
	private String climaPred;
	private double densidadeDemo;
	private int id; 
	
	public Estado() {
		
	}
	
	public Estado(int id,String nome, String regiao, String climaPred, double densidadeDemo, Pais pais) {
		this.setId(id);
		this.setNome(nome);
		this.setRegiao(regiao);
		this.setClimaPred(climaPred);
		this.setDensidadeDemo(densidadeDemo);
		this.setPais(pais);
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
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
	
	public String getRegiao() {
		return regiao;
	}
	
	public void setRegiao(String regiao) {
		if(regiao.isEmpty() || regiao.equals(null)) {
			throw new IllegalArgumentException("Região inválida, digite pelo menos um caracter!");
		}
		
		this.regiao = regiao;
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
	
	public double getDensidadeDemo() {
		return densidadeDemo;
	}
	
	public void setDensidadeDemo(double densidadeDemo) {
		if(densidadeDemo < 0) {
			throw new IllegalArgumentException("Densidade demográfica inválida, digite um número maior que zero!");
		}
		
		this.densidadeDemo = densidadeDemo;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		return Objects.equals(climaPred, other.climaPred)
				&& Double.doubleToLongBits(densidadeDemo) == Double.doubleToLongBits(other.densidadeDemo)
				&& Objects.equals(nome, other.nome) && Objects.equals(pais, other.pais)
				&& Objects.equals(regiao, other.regiao);
	}
	
	
	
}
