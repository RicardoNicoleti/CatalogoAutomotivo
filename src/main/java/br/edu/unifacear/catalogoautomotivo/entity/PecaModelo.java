package br.edu.unifacear.catalogoautomotivo.entity;

public class PecaModelo {
	private Long id;
	private Peca peca;
	private Modelo modelo;
	  
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Peca getPeca() {
		return peca;
	}
	public void setPeca(Peca peca) {
		this.peca = peca;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	 
	  
	
}
