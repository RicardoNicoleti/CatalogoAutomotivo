package br.edu.unifacear.catalogoautomotivo.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class PecaModelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Peca peca;
	
	@ManyToOne
	@JoinColumn(nullable = false)
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
