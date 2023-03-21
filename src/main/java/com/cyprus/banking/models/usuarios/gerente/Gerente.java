package com.cyprus.banking.models.usuarios.gerente;

import com.cyprus.banking.models.conta.Conta;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import com.cyprus.banking.models.usuarios.Usuario;

import lombok.Getter;
import lombok.Setter;




@Entity
@Table(name = "gerente")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Gerente extends Usuario{

	public Gerente(String nome, String cpf, String rg, int telefone, String email, String senha) {
		super(nome, cpf, rg, telefone, email, senha);
	}

	@OneToMany
	private Conta conta;
}
