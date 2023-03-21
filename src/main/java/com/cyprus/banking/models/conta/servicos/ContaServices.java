package com.cyprus.banking.models.conta.servicos;

import com.cyprus.banking.models.conta.Conta;
import com.cyprus.banking.models.conta.TipoConta;
import com.cyprus.banking.models.conta.repositorios.ContaRepository;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Valid
@Service
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ContaServices {
	
	private ContaRepository contaRepo;
	
	public ResponseEntity<Conta> criarConta(Conta conta) {
			contaRepo.save(conta);
		    return ResponseEntity.ok().body(conta);
		}

	
	
}
