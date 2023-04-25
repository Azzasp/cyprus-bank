package com.cyprus.banking.backend.models.usuarios.gerente.repositorios;

import java.util.List;

import com.cyprus.banking.backend.models.usuarios.gerente.Gerente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

@Repository
public interface GerenteRepository extends JpaRepository<Gerente, Integer> {
	@Query("select (count(g) > 0) from Gerente g where g.email = ?1")
	boolean existEmail(@NonNull String email);

}
