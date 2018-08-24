package br.edu.unifacear.catalogoautomotivo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

public class Modelo {
	private Long id;
	private String nome;
	private Montadora montadora;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "modelo", cascade = CascadeType.ALL, targetEntity = ModeloAplicacao.class)
	private List<ModeloAplicacao> listaModeloAplicacao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Montadora getMontadora() {
		return montadora;
	}
	public void setMontadora(Montadora montadora) {
		this.montadora = montadora;
	}
	public List<ModeloAplicacao> getListaModeloAplicacao() {
		return listaModeloAplicacao;
	}
	public void setListaModeloAplicacao(List<ModeloAplicacao> listaModeloAplicacao) {
		this.listaModeloAplicacao = listaModeloAplicacao;
	}
	
}
