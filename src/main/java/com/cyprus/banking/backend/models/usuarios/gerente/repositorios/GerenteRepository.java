package com.cyprus.banking.backend.models.usuarios.gerente.repositorios;

import java.util.List;

import com.cyprus.banking.backend.models.usuarios.gerente.Gerente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GerenteRepository extends JpaRepository<Gerente, Integer> {
	List<Gerente> findByEmail(String email);
}
