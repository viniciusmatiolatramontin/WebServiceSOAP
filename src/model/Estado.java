package model;

public class Estado {
	private String nome;
	private String regiao;
	private String climaPred;
	private double densidadeDemo;
	
	public Estado() {
		
	}
	
	public Estado(String nome, String regiao, String climaPred, double densidadeDemo) {
		this.setNome(nome);
		this.setRegiao(regiao);
		this.setClimaPred(climaPred);
		this.setDensidadeDemo(densidadeDemo);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome.isEmpty() || nome.equals(null)) {
			throw new IllegalArgumentException("Nome inv�lido, digite pelo menos um caracter!");
		}
		
		this.nome = nome;
	}
	
	public String getRegiao() {
		return regiao;
	}
	
	public void setRegiao(String regiao) {
		if(regiao.isEmpty() || regiao.equals(null)) {
			throw new IllegalArgumentException("Regi�o inv�lida, digite pelo menos um caracter!");
		}
		
		this.regiao = regiao;
	}
	
	public String getClimaPred() {
		return climaPred;
	}
	
	public void setClimaPred(String climaPred) {
		if(climaPred.isEmpty() || climaPred.equals(null)) {
			throw new IllegalArgumentException("Clima predominante inv�lido, digite pelo menos um caracter!");
		}
		
		this.climaPred = climaPred;
	}
	
	public double getDensidadeDemo() {
		return densidadeDemo;
	}
	
	public void setDensidadeDemo(double densidadeDemo) {
		if(densidadeDemo < 0) {
			throw new IllegalArgumentException("Densidade demogr�fica inv�lida, digite um n�mero maior que zero!");
		}
		
		this.densidadeDemo = densidadeDemo;
	}
	
	
}
