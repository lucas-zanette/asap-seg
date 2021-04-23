package com.seguros.asap.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "Cliente")
public class Cliente {
	
	@Id
	private String id;
	
	@NotNull
	@NotBlank(message="Hei, Então, o nome é obrigatório !")
	private String nome;
	
	@NotNull
	@NotBlank
	@CPF	
	private String cpf;
	
	@NotNull
	@NotBlank(message="Oi, a cidade é obrigatória !")
	private String cidade;
	
	@NotNull
	@NotBlank(message="Dá uma olhadinha lá na UF da cidade fazendo favor !")
	private String uf;

	public void setId(String id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public String getId() {
		return id;
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}