package com.br.osm.esocial.treinamento.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.br.osm.esocial.treinamento.enums.EnumAcao;
import com.br.osm.esocial.treinamento.enums.EnumStatus;

@Entity
@Table(name = "evento", schema="treinamento")
public class Evento {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nomeTrabalhador;
	private String CPF;
	private EnumStatus status;
	private EnumAcao acao;
	private Date dataEntrada;
	@JoinColumn(name = "id_tipoevento", referencedColumnName = "id")
	@ManyToOne
	private TipoEvento tipoEvento;
	
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
	public EnumStatus getStatus() {
		return status;
	}
	public void setStatus(EnumStatus status) {
		this.status = status;
	}
	public EnumAcao getAcao() {
		return acao;
	}
	public void setAcao(EnumAcao acao) {
		this.acao = acao;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}
	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	
	
	
}
