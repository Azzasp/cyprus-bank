package com.cyprus.banking.models.usuarios.cliente;

import com.cyprus.banking.models.usuarios.Usuario;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "dependente")
public class Dependente extends Usuario {

    public Dependente(String nome, String cpf, String rg, int telefone, String email, String senha) {
        super(nome, cpf, rg, telefone, email, senha);
    }

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_usuario")
    private Cliente cliente;
}
