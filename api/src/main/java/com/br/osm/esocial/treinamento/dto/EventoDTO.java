package com.br.osm.esocial.treinamento.dto;

import java.util.Date;

public class EventoDTO {

	private Long id;
	private String nomeTrabalhador;
	private String CPF;
	private String status;
	private String acao;
	private Date dataEntrada;
	private Long idTipoEvento;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeTrabalhador() {
		return nomeTrabalhador;
	}
	public void setNomeTrabalhador(String nomeTrabalhador) {
		this.nomeTrabalhador = nomeTrabalhador;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAcao() {
		return acao;
	}
	public void setAcao(String acao) {
		this.acao = acao;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public Long getIdTipoEvento() {
		return idTipoEvento;
	}
	public void setIdTipoEvento(Long idTipoEvento) {
		this.idTipoEvento = idTipoEvento;
	}
	
	
}
