package com.cyprus.banking.backend.models.usuarios.cliente.repositorios;

import com.cyprus.banking.backend.models.usuarios.cliente.Cliente;
import com.cyprus.banking.backend.models.usuarios.cliente.Dependente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface DependenteRepository extends JpaRepository<Dependente, Integer> {
    @Transactional
    @Modifying
    @Query("delete from Dependente d where d.cliente = ?1")
    void deleteDependenteByClienteID(@NonNull Cliente cliente);



    List<Dependente> findAllDependentesByCliente(@Nullable Integer id_usuario);









}
