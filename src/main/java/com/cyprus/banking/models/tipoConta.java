package com.cyprus.banking.models;

public class tipoConta {

	private int id_tipoConta;
	private String descricao;
	
	public tipoConta() {
	}
	
	public tipoConta(int id_tipoConta, String descricao) {
		super();
		this.id_tipoConta = id_tipoConta;
		this.descricao = descricao;
	}
	public int getId_tipoConta() {
		return id_tipoConta;
	}
	public void setId_tipoConta(int id_tipoConta) {
		this.id_tipoConta = id_tipoConta;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}


