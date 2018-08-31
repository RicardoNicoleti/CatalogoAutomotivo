package br.edu.unifacear.catalogoautomotivo.test;

import org.junit.Ignore;
import org.junit.Test;

import br.edu.unifacear.catalogoautomotivo.dao.AplicacaoDAO;
import br.edu.unifacear.catalogoautomotivo.entity.Aplicacao;

public class AplicacaoTest {
	@Test
	@Ignore
	public void inserir() {
		Aplicacao Aplicacao = new Aplicacao();
		Aplicacao.setDescricao("Suspenssão");
		AplicacaoDAO pDao = new AplicacaoDAO();
		pDao.salvar(Aplicacao);
	}
	@Test
	@Ignore
	public void editar() {
		Long id = 1L;
		AplicacaoDAO pDao = new AplicacaoDAO();
		pDao.salvar(pDao.buscar(id));
	}
	@Test
	@Ignore
	public void excluir() {
		Aplicacao Aplicacao = new Aplicacao();
		Aplicacao.setId(1L);
		AplicacaoDAO pDao = new AplicacaoDAO();
		pDao.excluir(Aplicacao);
	}
	@Test
	@Ignore
	public void listar() {
		AplicacaoDAO pDao = new AplicacaoDAO();
		pDao.listar();
		
	}
	@Test
	//@Ignore
	public void buscar() {
		Long id = 1L;
		
		AplicacaoDAO pDao = new AplicacaoDAO();
		System.out.println(pDao.buscar(id));
	}
}
