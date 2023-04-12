package com.cyprus.banking.backend.models.conta.servicos;

import com.cyprus.banking.backend.models.conta.Conta;
import com.cyprus.banking.backend.models.conta.repositorios.ContaRepository;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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

	public ResponseEntity<List<Conta>> visualizarTodasContas(){
		return ResponseEntity.ok().body(contaRepo.findAll());
	}

	public ResponseEntity<Conta> visualizarContaById(Integer id_conta){
		return ResponseEntity.ok().body(contaRepo.findById(id_conta).get());
	}

	public ResponseEntity<Double> visualizarSaldoConta(Integer id_conta){
		var conta = contaRepo.findById(id_conta).get();
		Double saldo = (Double) conta.getSaldo();
		return ResponseEntity.ok().body(saldo);
	}

	
	
}
