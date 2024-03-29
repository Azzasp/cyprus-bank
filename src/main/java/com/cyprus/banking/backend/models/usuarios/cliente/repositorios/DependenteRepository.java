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
import java.util.Optional;

public interface DependenteRepository extends JpaRepository<Dependente, Integer> {
    @Transactional
    @Modifying
    @Query("delete from Dependente d where d.cliente = ?1")
    void deleteDependenteByClienteID(@NonNull Cliente cliente);

    @Query("select (count(d) > 0) from Dependente d where d.email = ?1")
    boolean existEmail(@NonNull String email);

    Optional<Dependente> findByEmail(@NonNull String email);

    List<Dependente> findAllDependentesByCliente(@Nullable Integer id_usuario);









}
