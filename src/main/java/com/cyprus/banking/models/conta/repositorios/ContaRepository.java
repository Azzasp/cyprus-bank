package com.cyprus.banking.repositorios;

import com.cyprus.banking.models.Conta;
import com.cyprus.banking.models.TipoConta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer> {
	
	public Optional<Conta> findById(Integer id_conta);
	
	public List<Conta> findByNumeroConta(Integer numeroConta);
}



