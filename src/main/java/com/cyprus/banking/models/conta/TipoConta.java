package com.cyprus.banking.models.conta;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;


@Entity
@Table(name = "tipoConta")
@Getter
@Setter
public class TipoConta {

@Id
@SequenceGenerator(name = "id_tipoConta", allocationSize = 1, sequenceName = "id_sequence")
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_sequence")
	private int id_tipoConta;
	private String descricao;
	
	public TipoConta() {
	}
	
	public TipoConta(int id_tipoConta, String descricao) {
		super();
		this.id_tipoConta = id_tipoConta;
		this.descricao = descricao;
	}
}


