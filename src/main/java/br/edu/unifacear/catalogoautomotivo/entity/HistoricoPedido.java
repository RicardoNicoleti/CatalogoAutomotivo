package br.edu.unifacear.catalogoautomotivo.entity;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Access(AccessType.FIELD)
public class HistoricoPedido {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Pedido pedido;
	
	@Temporal(TemporalType.DATE)
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
