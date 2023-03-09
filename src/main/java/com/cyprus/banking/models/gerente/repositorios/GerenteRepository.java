package com.cyprus.banking.models.gerente.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyprus.banking.models.gerente.Gerente;

@Repository
public interface GerenteRepository extends JpaRepository<Gerente, Integer> {
	List<Gerente> findByEmail(String email);
}
