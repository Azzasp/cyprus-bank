package com.cyprus.banking.backend.models.usuarios.cliente;

import com.cyprus.banking.backend.models.endereco.Endereco;
import com.cyprus.banking.backend.models.usuarios.Usuario;
import com.cyprus.banking.backend.models.conta.Conta;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente extends Usuario {

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String rg, int telefone, String email, String senha, Endereco endereco, Conta conta) {
        super(nome, cpf, rg, telefone, email, senha, endereco, conta);
    }

}
