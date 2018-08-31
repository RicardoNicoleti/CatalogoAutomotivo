package br.edu.unifacear.catalogoautomotivo.test;

import org.junit.Ignore;
import org.junit.Test;

import br.edu.unifacear.catalogoautomotivo.dao.LinhaDAO;
import br.edu.unifacear.catalogoautomotivo.entity.Linha;

public class LinhaTest {
	@Test
	@Ignore
	public void inserir() {
		Linha linha = new Linha();
		linha.setDescricao("Linha 1");
		LinhaDAO lDao = new LinhaDAO();
		lDao.salvar(linha);
	}
	@Test
	@Ignore
	public void editar() {
		Long id = 1L;
		LinhaDAO lDao = new LinhaDAO();
		lDao.salvar(lDao.buscar(id));
	}
	@Test
	@Ignore
	public void excluir() {
		Linha linha = new Linha();
		linha.setId(1L);
		LinhaDAO lDao = new LinhaDAO();
		lDao.excluir(linha);
	}
	@Test
	@Ignore
	public void listar() {
		LinhaDAO lDao = new LinhaDAO();
		lDao.listar();
		
	}
	@Test
	@Ignore
	public void buscar() {
		Long id = 1L;
		
		LinhaDAO lDao = new LinhaDAO();
		System.out.println(lDao.buscar(id));
	}
}
