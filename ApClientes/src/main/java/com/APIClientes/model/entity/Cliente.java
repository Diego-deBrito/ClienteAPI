package com.APIClientes.model.entity;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;



//mapear classe para banco de dados
@Entity
public class Cliente {
	
	@Id
	private Integer ID;
	private String nome;
	private String cpf;
	private LocalDate dataCadastro;
	

}
