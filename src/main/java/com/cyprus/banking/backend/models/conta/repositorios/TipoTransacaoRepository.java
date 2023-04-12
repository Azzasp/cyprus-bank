package com.cyprus.banking.backend.models.conta.repositorios;

import com.cyprus.banking.backend.models.conta.TipoTransacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoTransacaoRepository extends JpaRepository<TipoTransacao,Integer> {

}
