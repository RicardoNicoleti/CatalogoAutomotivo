package br.edu.unifacear.catalogoautomotivo.test;

import org.junit.Ignore;
import org.junit.Test;

import br.edu.unifacear.catalogoautomotivo.dao.LinhaDAO;
import br.edu.unifacear.catalogoautomotivo.dao.MontadoraDAO;
import br.edu.unifacear.catalogoautomotivo.entity.Montadora;

public class MontadoraTest {
	@Test
	//@Ignore
	public void inserir() {
		LinhaDAO lDao = new LinhaDAO();
		Long idLinha = 1L;
		Montadora Montadora = new Montadora();
		Montadora.setNome("Montadora 1");
		Montadora.setLinha(lDao.buscar(idLinha));
		MontadoraDAO pDao = new MontadoraDAO();
		pDao.salvar(Montadora);
	}
	@Test
	@Ignore
	public void editar() {
		Long id = 1L;
		MontadoraDAO pDao = new MontadoraDAO();
		pDao.salvar(pDao.buscar(id));
	}
	@Test
	@Ignore
	public void excluir() {
		Montadora Montadora = new Montadora();
		Montadora.setId(1L);
		MontadoraDAO pDao = new MontadoraDAO();
		pDao.excluir(Montadora);
	}
	@Test
	@Ignore
	public void listar() {
		MontadoraDAO pDao = new MontadoraDAO();
		pDao.listar();
		
	}
	@Test
	@Ignore
	public void buscar() {
		Long id = 1L;
		
		MontadoraDAO pDao = new MontadoraDAO();
		System.out.println(pDao.buscar(id));
	}
}
