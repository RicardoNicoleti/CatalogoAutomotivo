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
public class Avaliacao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Peca peca;
	
	@Column(length = 200, nullable = false)
	private String descricao;
	
	@Column(nullable = true)
	private Short like;
	
	@Column(nullable = true)
	private Short deslike;
	
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

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Short getLike() {
		return like;
	}
	public void setLike(Short like) {
		this.like = like;
	}
	public Short getDeslike() {
		return deslike;
	}
	public void setDeslike(Short deslike) {
		this.deslike = deslike;
	}
}
