package br.edu.unifacear.catalogoautomotivo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Peca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length=50, nullable = false)
	private String codigoPeca;
	
	@Column(length=100, nullable = false)
	private String nome;

	@Column(precision = 7, scale = 2, nullable = false)
	private double preco;
	
	@Column(length = 200, nullable = false)
	private String descricao;
	
	@Column(length = 100, nullable = false)
	private String foto;
	
	@Column(nullable = false)
	private Short quantidadeEstoque;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "peca", cascade = CascadeType.ALL, targetEntity = PecaModelo.class)
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
