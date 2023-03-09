package com.cyprus.banking.models.endereco.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyprus.banking.models.endereco.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{
	Optional<Endereco> findById(Integer id_endereco);
}
