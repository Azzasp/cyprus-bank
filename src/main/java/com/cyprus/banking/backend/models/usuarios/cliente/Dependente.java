package com.cyprus.banking.backend.models.usuarios.cliente;

import com.cyprus.banking.backend.models.endereco.Endereco;
import com.cyprus.banking.backend.models.usuarios.Usuario;
import com.cyprus.banking.backend.models.conta.Conta;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "dependente")
@Getter
@Setter
public class Dependente extends Usuario {

    public Dependente(String nome, String cpf, String rg, int telefone, String email, String senha, Endereco endereco, Conta conta, Cliente cliente) {
        super(nome, cpf, rg, telefone, email, senha, endereco, conta);
        this.cliente = cliente;
    }

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_usuario")
    private Cliente cliente;
}
