package com.cyprus.banking.repositorios;

import com.cyprus.banking.models.TipoConta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tipoContaRepository extends JpaRepository<TipoConta, Integer>{

}
