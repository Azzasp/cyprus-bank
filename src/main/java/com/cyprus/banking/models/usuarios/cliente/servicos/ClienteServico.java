package com.cyprus.banking.models.usuarios.cliente.servicos;

import com.cyprus.banking.models.usuarios.cliente.Dependente;
import com.cyprus.banking.models.usuarios.cliente.repositorios.ClienteRepository;
import com.cyprus.banking.models.usuarios.cliente.repositorios.DependenteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteServico {

    private final ClienteRepository clienteRepository;
    private final DependenteRepository dependenteRepository;

    public ResponseEntity<Dependente> cadastrarDependente(Dependente dependente){
        var saved = dependenteRepository.save(dependente);
        return ResponseEntity.ok().body(dependente);
    }

    public ResponseEntity<List<Dependente>> visualizarDependentes(Integer id_cliente){
        List<Dependente> dependentes = dependenteRepository.findAllDependentesByClienteID(id_cliente);
        return ResponseEntity.ok().body(dependentes);
    }

    public ResponseEntity<Dependente> atualizarDependente(Dependente dependente){
        dependenteRepository.save(dependente);
        return ResponseEntity.ok().body(dependente);
    }

    public ResponseEntity deletarConta(Integer id_conta){
        try {
            clienteRepository.deleteById(id_conta);
            dependenteRepository.deleteDependenteByClienteID(id_conta);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return ResponseEntity.ok().body(HttpStatus.NO_CONTENT);
    }

}
