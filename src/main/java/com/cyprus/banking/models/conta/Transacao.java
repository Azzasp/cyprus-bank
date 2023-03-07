package com.cyprus.banking.models.conta;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Transacao {

    @ManyToOne(targetEntity = Conta.class)
    @JoinColumn(name = "remetente",
            referencedColumnName = "id_conta")
    private Conta remetente;
    @JoinColumn(name = "destinatario",
            referencedColumnName = "id_conta")
    @ManyToOne(targetEntity = Conta.class)
    private Conta destinatario;
    private Date date;
    private Double valor;
//    TODO: Analisar dinâmica do comprovante
    @Id
    @SequenceGenerator(name = "comprovante", allocationSize = 1, sequenceName = "id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_sequence")
    private Integer comprovante;

    @OneToOne
    @JoinColumn(name = "TipoTransacao", referencedColumnName = "id_tipoTransacao")
    private TipoTransacao tipoTransacao;

}
