package com.cyprus.banking.models;

import com.cyprus.banking.models.tipoConta;

public class Conta {

	private int numeroConta;
	private double saldo;
	private int cartao;
	private String chaveSec;
	private int id_Conta;
	
	private tipoConta tipoconta;
	
	public Conta() {
	}
	
	public Conta(int numeroConta, double saldo, int cartao, String chaveSec, int id_Conta) {
		super();
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.cartao = cartao;
		this.chaveSec = chaveSec;
		this.id_Conta = id_Conta;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getCartao() {
		return cartao;
	}
	public void setCartao(int cartao) {
		this.cartao = cartao;
	}
	public String getChaveSec() {
		return chaveSec;
	}
	public void setChaveSec(String chaveSec) {
		this.chaveSec = chaveSec;
	}
	public int getId_Conta() {
		return id_Conta;
	}
	public void setId_Conta(int id_Conta) {
		this.id_Conta = id_Conta;
	}
	
	
}

