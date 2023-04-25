package com.cyprus.banking.backend.security.requests;

import com.cyprus.banking.backend.models.conta.Conta;
import com.cyprus.banking.backend.models.endereco.Endereco;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String nome;
    private String cpf;
    private String rg;
    private int telefone;
    private String email;
    private String senha;
    private Endereco endereco;


}
