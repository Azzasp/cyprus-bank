package com.cyprus.banking.backend.models.conta.repositorios;


import com.cyprus.banking.backend.models.conta.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer> {
	
	public List<Conta> findByNumeroConta(int numeroConta);
}



