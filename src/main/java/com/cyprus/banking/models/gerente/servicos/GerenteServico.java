package com.cyprus.banking.models.gerente.servicos;

import org.springframework.stereotype.Service;

import com.cyprus.banking.models.conta.Conta;

@Service
public class GerenteServico {
	private ContaRepository contaRepository;
	private ClienteRepository clienteRepository;
	private DependenteRepository dependenteRepository;

	public Conta alterarDadosDaConta(Conta conta) {
//		preciso pensar nessa logica
		contaRepository.save(conta);
		return conta;
	}

	public void excluirCliente() {
//		preciso pensar nessa logica
	Cliente cliente	= clienteRepository.findByEmail(cliente.getEmail);
	clienteRepository.deleteById(cliente.getId_cliente);
	}

}
