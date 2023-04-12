package com.cyprus.banking.backend.models.endereco.repositorios;

import java.util.Optional;

import com.cyprus.banking.backend.models.endereco.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{
	Optional<Endereco> findById(Integer id_endereco);
}
