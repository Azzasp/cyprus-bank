package com.cyprus.banking.models.conta.repositorios;


import com.cyprus.banking.models.conta.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer> {
	
	public List<Conta> findByNumeroConta(int numeroConta);
}



