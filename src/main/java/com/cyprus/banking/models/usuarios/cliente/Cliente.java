package com.cyprus.banking.models.usuarios.cliente;

import com.cyprus.banking.models.conta.Conta;
import com.cyprus.banking.models.endereco.Endereco;
import com.cyprus.banking.models.usuarios.Usuario;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cliente")
public class Cliente extends Usuario {

    public Cliente(String nome, String cpf, String rg, int telefone, String email, String senha, Endereco endereco, Conta conta) {
        super(nome, cpf, rg, telefone, email, senha, endereco, conta);
    }
}
