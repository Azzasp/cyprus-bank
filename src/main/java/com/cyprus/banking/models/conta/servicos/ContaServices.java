package com.cyprus.banking.servicos;

import com.cyprus.banking.models.Conta;
import com.cyprus.banking.models.TipoConta;
import com.cyprus.banking.repositorios.ContaRepository;
import com.cyprus.banking.repositorios.tipoContaRepository;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
	
	public Conta criarConta(
		    @NotNull int id_Conta,
		    @NotNull @Positive int numeroConta,
		    @NotNull @Positive double saldo,
		    @NotNull @Positive int cartao,
		    @NotNull String chaveSec,
		    @NotNull TipoConta tipo_conta
		) {
		    var conta = new Conta(id_Conta, saldo, cartao, chaveSec, tipo_conta);
		    return contaRepo.save(conta);
		}

	
	
}
