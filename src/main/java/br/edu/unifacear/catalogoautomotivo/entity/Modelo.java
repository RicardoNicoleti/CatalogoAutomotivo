package br.edu.unifacear.catalogoautomotivo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Access(AccessType.FIELD)
public class Modelo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 50, nullable = false)
	private String nome;
		
	@ManyToOne
	@JoinColumn(nullable = false)
	private Montadora montadora;
	
	@OneToMany(mappedBy = "modelo", fetch = FetchType.EAGER, targetEntity = ModeloAplicacao.class)
	private List<ModeloAplicacao> listaAplicacoes = new ArrayList<ModeloAplicacao>();
	
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
	public List<ModeloAplicacao> getListaAplicacoes() {
		return listaAplicacoes;
	}
	public void setListaAplicacoes(List<ModeloAplicacao> listaAplicacoes) {
		this.listaAplicacoes = listaAplicacoes;
	}
	
	
	
}
