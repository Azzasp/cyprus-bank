package com.cyprus.banking.models.endereco;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Endereco {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false, nullable = false)
	private int id_endereco;
	@Column
	private String cep;
	@Column
	private String cidade;
	@Column
	private String estado;
	@Column
	private String rua;
	

}
