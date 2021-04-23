package com.seguros.asap.entity;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


@Document(collection="Apolice")
public class Apolice {
	
	@Id
	private String numeroApolice;
	
	@NotNull
	@NotBlank
	@DateTimeFormat(iso = ISO.DATE, fallbackPatterns = { "M/d/yy", "dd.MM.yyyy" })
	private Date dataInicialApolice;
	
	@NotNull
	@NotBlank(message="Olá, a data final é obrigatória !")
	@DateTimeFormat(iso = ISO.DATE, fallbackPatterns = { "M/d/yy", "dd.MM.yyyy" })
	private Date dataFinalApolice;
	
	@NotNull
	@NotBlank(message="Favor entre com a placa do veículo !")
	private String placaVeiculoApolice;
	
	@NotNull
	@NotBlank(message="É necessário digitar o valor da apólice !")
	private Double valorApolice;	
	private String status;
	private int diasVencimento;
	
	
	@DBRef
	private Cliente cliente;
	
	public String getNumeroApolice() {
		return numeroApolice;
	}
	public void setNumeroApolice(String numeroApolice) {
		this.numeroApolice = numeroApolice;
	}

	
	public Date getDataInicialApolice() {
		return dataInicialApolice;
	}
	public void setDataInicialApolice(Date dataInicialApolice) {
		this.dataInicialApolice = dataInicialApolice;
	}
	
	
	public Date getDataFinalApolice() {
		return dataFinalApolice;
	}
	public void setDataFinalApolice(Date dataFinalApolice) {
		this.dataFinalApolice = dataFinalApolice;
	}
	
	
	public String getPlacaVeiculoApolice() {
		return placaVeiculoApolice;
	}
	public void setPlacaVeiculoApolice(String placaVeiculoApolice) {
		this.placaVeiculoApolice = placaVeiculoApolice;
	}
	
	
	public Double getValorApolice() {
		return valorApolice;
	}
	public void setValorApolice(Double valorApolice) {
		this.valorApolice = valorApolice;
	}
		
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getDiasVencimento() {
		return diasVencimento;
	}
	public void setDiasVencimento(int diasVencimento) {
		this.diasVencimento = diasVencimento;
	}	
	
	
	

}
