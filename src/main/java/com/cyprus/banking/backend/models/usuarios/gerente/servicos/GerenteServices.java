package com.cyprus.banking.backend.models.usuarios.gerente.servicos;

import com.cyprus.banking.backend.models.conta.Conta;
import com.cyprus.banking.backend.models.conta.repositorios.ContaRepository;
import com.cyprus.banking.backend.models.usuarios.cliente.Cliente;
import com.cyprus.banking.backend.models.usuarios.cliente.repositorios.ClienteRepository;
import com.cyprus.banking.backend.models.usuarios.cliente.repositorios.DependenteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



@Service
public class GerenteServices {

	private ContaRepository contaRepository;
	private ClienteRepository clienteRepository;
	private DependenteRepository dependenteRepository;

	public ResponseEntity<Conta> atualizarDadosDaConta(Integer id, Conta conta) {
		contaRepository.findById(id)
				.map(record -> {
					record.setChaveSec(conta.getChaveSec());
					var update = contaRepository.save(record);
					return ResponseEntity.ok().body(update);
				});
		return ResponseEntity.notFound().build();
	}

	public void excluirCliente(Cliente cliente) {
		try {
			clienteRepository.deleteById(cliente.getId_usuario());
			dependenteRepository.deleteDependenteByClienteID(cliente);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

	public void excluirDependente(Integer id) {
		dependenteRepository.deleteById(id);
	}

}
