package br.edu.unifacear.catalogoautomotivo.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Access(AccessType.FIELD)
public class Montadora {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length=50, nullable = false)
	private String nome;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Linha linha;
	
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
	public Linha getLinha() {
		return linha;
	}
	public void setLinha(Linha linha) {
		this.linha = linha;
	}
	@Override
	public String toString() {
		return "Montadora [id=" + id + ", nome=" + nome + ", linha=" + linha + "]";
	}

}
