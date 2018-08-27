package br.edu.unifacear.catalogoautomotivo.business;

import java.util.List;

import br.edu.unifacear.catalogoautomotivo.dao.PecaDAO;
import br.edu.unifacear.catalogoautomotivo.entity.Peca;

public class PecaBusiness {
	PecaDAO PecaDAO = new PecaDAO();

	public void inserir(Peca Peca) {
		PecaDAO.salvar(Peca);
	}
	
	public void editar(Peca Peca) {
		PecaDAO.editar(Peca);
	}
	
	public void excluir(Long id) {
		PecaDAO.excluir(PecaDAO.buscar(id));
	}
	
	public List<Peca> listarPecas(){
		List<Peca> listaPecas = PecaDAO.listar();
		
		return listaPecas;
	}
	
	public Peca buscar(Long id) {
		Peca Peca = PecaDAO.buscar(id);
		return Peca;
	}
}
