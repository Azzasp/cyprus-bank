package com.cyprus.banking.backend.models.usuarios.cliente.repositorios;

import com.cyprus.banking.backend.models.usuarios.cliente.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {



}
