package com.cyprus.banking.models.usuarios.cliente.repositorios;

import com.cyprus.banking.models.usuarios.cliente.Cliente;
import com.cyprus.banking.models.usuarios.cliente.Dependente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface DependenteRepository extends JpaRepository<Dependente, Integer> {

    @Transactional
    @Modifying
    @Query("delete from Dependente d where d.id_cliente = ?1")
    void deleteDependenteByClienteID(Integer id_cliente);

    List<Dependente> findAllDependentesByClienteID(@NonNull Integer id_usuario);






}
