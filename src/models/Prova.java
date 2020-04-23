package models;

public class Prova {
	private int ano;
	private Banca banca;
	private String orgao;
	private String cargo;
	
	//CONSTRUTOR
	public Prova(int ano, Banca banca, String orgao, String cargo){
		this.ano = ano;
		this.banca = banca;
		this.orgao = orgao;
		this.cargo = cargo;
	}
	
	//GETTERS E SETTERS
	
	
	//MÉTODOS
	public void imprimeProva(){
		System.out.print("(" + this.ano + " - " + this.banca.getBanca() +
				" - " + this.orgao + " - " + this.cargo + ") ");
	}
}
