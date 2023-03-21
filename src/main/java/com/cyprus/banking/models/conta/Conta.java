package com.cyprus.banking.models;

import com.cyprus.banking.models.TipoConta;
import com.cyprus.banking.utils.Utils;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "conta")
public class Conta {

	@Id
	@SequenceGenerator(name = "id_conta", allocationSize = 1, sequenceName = "id_sequence")
	private Integer id_conta;
	private int NumeroConta;
	private double Saldo;
	private int Cartao;
	private String ChaveSec;
	
	private static int counter = 1000;
	
	@OneToOne
	@JoinColumn(name = "TipoConta", referencedColumnName = "id_tipoConta")
	private TipoConta tipo_conta;
	
	public Conta() {
	}
	
	public Conta(int idConta, double Saldo, int Cartao, String ChaveSec, TipoConta tipo_conta) {
		super();
		this.id_conta = idConta;
		this.NumeroConta = counter;
		this.Saldo = Saldo;
		this.Cartao = Cartao;
		this.ChaveSec = ChaveSec;
		counter += 1;
	}
	
	public String mostrarSaldo() {
		return "nSaldo disponível em conta: " + Utils.doubleToString(this.Saldo);
	}
	
	
}

