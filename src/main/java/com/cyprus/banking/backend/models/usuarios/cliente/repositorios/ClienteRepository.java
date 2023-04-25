package com.cyprus.banking.backend.models.usuarios.cliente.repositorios;

import com.cyprus.banking.backend.models.usuarios.cliente.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    @Query("select (count(c) > 0) from Cliente c where c.email = ?1")
    boolean existEmail(@NonNull String email);

    Optional<Cliente> findByEmail(@NonNull String email);



}
