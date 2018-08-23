package br.edu.unifacear.catalogoautomotivo.entity;

import java.util.Date;

public class HistoricoPedido {
	private Long id;
	private Pedido pedido;
	private Date dataHistorico;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Date getDataHistorico() {
		return dataHistorico;
	}
	public void setDataHistorico(Date dataHistorico) {
		this.dataHistorico = dataHistorico;
	}
	
	
}
