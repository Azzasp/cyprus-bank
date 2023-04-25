package com.cyprus.banking.backend.security.validations;

import com.cyprus.banking.backend.models.usuarios.cliente.Cliente;
import com.cyprus.banking.backend.models.usuarios.cliente.repositorios.ClienteRepository;
import com.cyprus.banking.backend.models.usuarios.cliente.repositorios.DependenteRepository;
import com.cyprus.banking.backend.models.usuarios.gerente.repositorios.GerenteRepository;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ValidatorService {

    private ClienteRepository clienteRepository;
    private DependenteRepository dependenteRepository;
    private GerenteRepository gerenteRepository;

    public boolean emailValidator(String email){
        if(clienteRepository.existEmail(email) ||
                dependenteRepository.existEmail(email) ||
                gerenteRepository.existEmail(email)) throw new IllegalStateException();
        String EMAIL_REGEX = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern pattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    public boolean validateCPF(String input){
        String CPF_REGEX = "^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$";
        Pattern pattern = Pattern.compile(CPF_REGEX, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

}
