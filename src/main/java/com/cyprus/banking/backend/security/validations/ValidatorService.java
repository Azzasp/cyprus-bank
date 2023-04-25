package com.cyprus.banking.backend.security.validations;

import com.cyprus.banking.backend.models.usuarios.cliente.repositorios.ClienteRepository;
import com.cyprus.banking.backend.models.usuarios.cliente.repositorios.DependenteRepository;
import com.cyprus.banking.backend.models.usuarios.gerente.repositorios.GerenteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.IllegalFormatException;
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

    public boolean passwordValidator(String password){
         String[] p = password.split("");
         return p.length == 8;
         /*
            Se a senha tiver 8 caracteres retorna verdadeiro e a senha é validada.
            Caso a senha não tenha 8 caracteres, retornará falso
         */
    }

    public boolean chaveSecValidator(String chaveSec){
        try{
            Integer c = Integer.parseInt(chaveSec); // Verifica se são numeros
            String[] p = chaveSec.split(""); // Verifica o tamanho

            return p.length == 6;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }



    }

}
