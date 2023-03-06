package com.cyprus.banking.models.conta;

import jakarta.persistence.*;
import jakarta.validation.Constraint;
import lombok.*;

import java.util.Date;

@Entity
@IdClass(Transacao.TransacaoId.class)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Transacao {

    @Id
    @ManyToMany(targetEntity = Conta.class)
    @JoinColumn(name = "remetente",
            referencedColumnName = "id_conta",
            unique = true)
    private Conta remetente;
    @Id
    @JoinColumn(name = "destinatario",
            referencedColumnName = "id_conta",
            unique = true)
    private Conta destinatario;
    private Date date;
    private Double valor;
//    TODO: Analisar dinamica do comprovante
    private int comprovante;

    @Embeddable
    @RequiredArgsConstructor
    @Getter
    @Setter
    public static class TransacaoId{
        private Conta remetente;
        private Conta destinatario;
    }
}
