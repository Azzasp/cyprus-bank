package com.cyprus.banking.models.conta.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoTransacaoRepository extends JpaRepository<TipoTransacaoRepository,Integer> {
}
