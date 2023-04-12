package com.cyprus.banking.backend.models.conta.repositorios;

import com.cyprus.banking.backend.models.conta.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Integer> {
    List<Transacao> findAllByRemetente(@NonNull Integer id_conta);



}
