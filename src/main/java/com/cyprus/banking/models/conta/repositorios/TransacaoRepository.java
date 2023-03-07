package com.cyprus.banking.models.conta.repositorios;

import com.cyprus.banking.models.conta.Conta;
import com.cyprus.banking.models.conta.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacao, Conta> {
}
