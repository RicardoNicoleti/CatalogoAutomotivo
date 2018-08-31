package br.edu.unifacear.catalogoautomotivo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.swing.text.StyledEditorKit.ForegroundAction;

@Entity
@Access(AccessType.FIELD)
public class Peca {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 100, nullable = false)
	private String codigoPeca;
	
	@Column(length = 200, nullable = false)
	private String nome;
	
	@Column(precision = 7, scale = 2, nullable = false)
	private double preco;
	
	@Column(length = 300, nullable = true)
	private String descricao;
	
	@Column(length = 100, nullable = false)
	private String foto;
	
	@Column(nullable = false)
	private Short quantidadeEstoque;
	
	@OneToMany(mappedBy = "peca", fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = PecaModelo.class)
	private List<PecaModelo> listaPecaModelo = new ArrayList<PecaModelo>();

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

	@Override
	public String toString() {
		return "Peca [id=" + id + ", codigoPeca=" + codigoPeca + ", nome=" + nome + ", preco=" + preco + ", descricao="
				+ descricao + ", foto=" + foto + ", quantidadeEstoque=" + quantidadeEstoque + ", listaPecaModelo="
				+ listaPecaModelo + "]";
	}

}
