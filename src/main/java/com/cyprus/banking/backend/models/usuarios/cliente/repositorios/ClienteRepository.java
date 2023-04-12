package com.cyprus.banking.backend.models.usuarios.cliente.repositorios;

import com.cyprus.banking.backend.models.usuarios.cliente.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {



}
