package com.cyprus.banking.models.conta;

import com.cyprus.banking.models.conta.TipoConta;
import com.cyprus.banking.models.usuarios.gerente.Gerente;
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
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_sequence")
	private Integer id_conta;
	private int numeroConta;
	private double Saldo;
	private int Cartao;
	private String ChaveSec;

	@ManyToOne
	@JoinColumn(name = "id_gerente", referencedColumnName = "id_usuario")
	private Gerente gerente;
	
	private static int counter = 1000;
	
	@OneToOne
	@JoinColumn(name = "tipo_conta", referencedColumnName = "id_tipoConta")
	private TipoConta tipo_conta;
	
	public Conta() {
	}
	
	public Conta(int idConta, double Saldo, int Cartao, String ChaveSec, TipoConta tipo_conta) {
		this.id_conta = idConta;
		this.numeroConta = counter;
		this.Saldo = Saldo;
		this.Cartao = Cartao;
		this.ChaveSec = ChaveSec;
		counter += 1;
	}

	
	
}

