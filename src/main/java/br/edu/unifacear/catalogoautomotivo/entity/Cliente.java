package br.edu.unifacear.catalogoautomotivo.entity;

public class Cliente {
	private Long id;
	private TipoCliente cliente;
	private Pessoa pessoa;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public TipoCliente getCliente() {
		return cliente;
	}
	public void setCliente(TipoCliente cliente) {
		this.cliente = cliente;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
