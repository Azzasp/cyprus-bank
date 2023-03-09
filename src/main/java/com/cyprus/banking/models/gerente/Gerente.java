package com.cyprus.banking.models.gerente;

import org.springframework.data.annotation.Id;

import com.cyprus.banking.models.usuarios.Usuario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;




@Entity
public class Gerente extends Usuario{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false, nullable = false)
	private int id_gerente;
}
