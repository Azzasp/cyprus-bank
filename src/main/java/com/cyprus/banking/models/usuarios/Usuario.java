package com.cyprus.banking.models.usuarios;

import jakarta.persistence.*;
import lombok.*;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Usuario {
    @Id
    @SequenceGenerator(name = "id_usuario", allocationSize = 1, sequenceName = "id_usuario")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_usuario")
    private Integer id_usuario;
    private String nome;
    private String cpf;
    private String rg;
    private int telefone;
    private String email;
    private String senha;

    public Usuario(String nome, String cpf, String rg, int telefone, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }
}
