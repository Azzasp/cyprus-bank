package com.cyprus.banking.backend.models.usuarios.gerente;

import com.cyprus.banking.backend.models.conta.Conta;
import com.cyprus.banking.backend.models.endereco.Endereco;
import com.cyprus.banking.backend.models.usuarios.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Table(name = "gerente")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Gerente extends Usuario {

	public Gerente(String nome, String cpf, String rg, int telefone, String email, String senha, Endereco endereco) {
		super(nome, cpf, rg, telefone, email, senha, endereco);
	}

	@OneToMany
	private List<Conta> contas;
}
