package br.edu.unifacear.catalogoautomotivo.entity;

public class ModeloAplicacao {
	private Long id;
	private Aplicacao aplicacao;
	private Modelo modelo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Aplicacao getAplicacao() {
		return aplicacao;
	}
	public void setAplicacao(Aplicacao aplicacao) {
		this.aplicacao = aplicacao;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	
}
