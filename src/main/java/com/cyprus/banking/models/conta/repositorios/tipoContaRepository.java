package com.cyprus.banking.models.conta.repositorios;


import com.cyprus.banking.models.conta.TipoConta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tipoContaRepository extends JpaRepository<TipoConta, Integer> {

}
