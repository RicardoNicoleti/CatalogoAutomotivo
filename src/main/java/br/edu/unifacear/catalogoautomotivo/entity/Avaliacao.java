package br.edu.unifacear.catalogoautomotivo.entity;

public class Avaliacao {
	private Long id;
	private Peca peca;
	private String descricao;
	private Short like;
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
