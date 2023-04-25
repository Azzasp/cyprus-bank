package com.cyprus.banking.backend.security;

import com.cyprus.banking.backend.models.conta.repositorios.ContaRepository;
import com.cyprus.banking.backend.models.endereco.repositorios.EnderecoRepository;
import com.cyprus.banking.backend.models.usuarios.cliente.Cliente;
import com.cyprus.banking.backend.models.usuarios.cliente.repositorios.ClienteRepository;
import com.cyprus.banking.backend.models.usuarios.cliente.repositorios.DependenteRepository;
import com.cyprus.banking.backend.models.usuarios.gerente.repositorios.GerenteRepository;
import com.cyprus.banking.backend.security.requests.LoginRequest;
import com.cyprus.banking.backend.security.requests.RegisterRequest;
import com.cyprus.banking.backend.security.validations.ValidatorService;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    private ClienteRepository clienteRepository;
    private DependenteRepository dependenteRepository;
    private GerenteRepository gerenteRepository;
    private ValidatorService validatorService;
    private EnderecoRepository enderecoRepository;
    private ContaRepository contaRepository;


    public boolean clienteRegisterRequest(RegisterRequest request){
        try {
            if (!validatorService.emailValidator(request.getEmail()))
                throw new IllegalArgumentException("Email invalido");
            if (!validatorService.passwordValidator(request.getSenha()))
                throw new IllegalArgumentException("Senha invalida");
            if (!validatorService.cpfValidator(request.getCpf())) throw new IllegalArgumentException("CPF Invalido");

            Cliente cliente = new Cliente(request.getNome(),
                    request.getCpf(),
                    request.getRg(),
                    request.getTelefone(),
                    request.getEmail(),
                    request.getSenha(),
                    request.getEndereco(),
                    request.getConta());
            enderecoRepository.save(cliente.getEndereco());
            contaRepository.save(cliente.getConta());
            clienteRepository.save(cliente);


        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean loginRequest(LoginRequest request){
        var user = clienteRepository.findByEmail(request.getEmail()).isPresent() ?
                    clienteRepository.findByEmail(request.getEmail()).get() :
                    dependenteRepository.findByEmail(request.getEmail()).isPresent() ?
                            dependenteRepository.findByEmail(request.getEmail()).get() :
                            gerenteRepository.findByEmail(request.getEmail()).get();
        /*
        * Verifica se existe esse email para cliente,
        * caso exista recebe o cliente.
        * Caso contrario verifica se existe para dependente,
        * caso exista recebe o cliente.
        * Caso contrario recebe gerente.
         * */

        return user.getEmail().equals(request.getEmail()) &&
                user.getSenha().equals(request.getPassword());
    }

}
