package com.cyprus.banking.models;

import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
public abstract class Usuario {
    private String nome;
    private String cpf;
    private String rg;
    private int telefone;
    private String email;
    private String senha;

}
