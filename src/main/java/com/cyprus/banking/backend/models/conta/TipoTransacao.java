package com.cyprus.banking.backend.models.conta;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Table(name = "TipoTransacao")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TipoTransacao {

    @Id
    @SequenceGenerator(name = "id_tipoTransacao", allocationSize = 1, sequenceName = "id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_sequence")
    private Integer id_tipoTransacao;
    private String descricao;


}
