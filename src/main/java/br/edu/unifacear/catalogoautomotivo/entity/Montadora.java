package br.edu.unifacear.catalogoautomotivo.entity;

public class Montadora {
	private Long id;
	private String nome;
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
	
	
}
