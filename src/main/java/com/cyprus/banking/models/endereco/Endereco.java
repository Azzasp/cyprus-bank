package com.cyprus.banking.models.endereco;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Endereco {

	@Id
	@SequenceGenerator(name = "id_endereco", allocationSize = 1, sequenceName = "id_sequence")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_sequence")
	private Integer id_endereco;
	@Column
	private String cep;
	@Column
	private String cidade;
	@Column
	private String estado;
	@Column
	private String rua;
	

}
