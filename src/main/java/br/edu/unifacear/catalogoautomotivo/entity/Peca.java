package br.edu.unifacear.catalogoautomotivo.entity;

import java.util.List;

public class Peca {
	
	private Long id;
	private String codigoPeca;
	private String nome;
	private double preco;
	private String descricao;
	private String foto;
	private Short quantidadeEstoque;
	private List<PecaModelo>listaPecaModelo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigoPeca() {
		return codigoPeca;
	}
	public void setCodigoPeca(String codigoPeca) {
		this.codigoPeca = codigoPeca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public Short getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(Short quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public List<PecaModelo> getListaPecaModelo() {
		return listaPecaModelo;
	}
	public void setListaPecaModelo(List<PecaModelo> listaPecaModelo) {
		this.listaPecaModelo = listaPecaModelo;
	}
	
}
