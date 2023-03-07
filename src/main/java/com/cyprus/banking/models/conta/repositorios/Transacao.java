package com.cyprus.banking.models.conta.repositorios;

import com.cyprus.banking.models.conta.TipoTransacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Transacao extends JpaRepository<TipoTransacao,Integer> {
}
