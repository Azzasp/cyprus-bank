package com.cyprus.banking.models.conta;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Conta {
    @Id
    @SequenceGenerator(name = "id_conta",
            allocationSize = 1,
            sequenceName = "id_sequence")
    private Integer id_conta;
}
