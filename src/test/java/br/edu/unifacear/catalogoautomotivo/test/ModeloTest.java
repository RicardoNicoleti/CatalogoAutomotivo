package br.edu.unifacear.catalogoautomotivo.test;

import org.junit.Ignore;
import org.junit.Test;

import br.edu.unifacear.catalogoautomotivo.dao.ModeloDAO;
import br.edu.unifacear.catalogoautomotivo.dao.MontadoraDAO;
import br.edu.unifacear.catalogoautomotivo.entity.Modelo;

public class ModeloTest {
	@Test
	//@Ignore
	public void inserir() {
		MontadoraDAO monDao = new MontadoraDAO();
		Long idMontadora = 1L;
		Modelo Modelo = new Modelo();
		Modelo.setNome("Modelo 1");
		Modelo.setMontadora(monDao.buscar(idMontadora));
		ModeloDAO mDao = new ModeloDAO();
		mDao.salvar(Modelo);
	}
	@Test
	@Ignore
	public void editar() {
		Long id = 1L;
		ModeloDAO mDao = new ModeloDAO();
		mDao.salvar(mDao.buscar(id));
	}
	@Test
	@Ignore
	public void excluir() {
		Modelo Modelo = new Modelo();
		Modelo.setId(1L);
		ModeloDAO mDao = new ModeloDAO();
		mDao.excluir(Modelo);
	}
	@Test
	@Ignore
	public void listar() {
		ModeloDAO mDao = new ModeloDAO();
		mDao.listar();
		
	}
	@Test
	@Ignore
	public void buscar() {
		Long id = 1L;
		
		ModeloDAO mDao = new ModeloDAO();
		System.out.println(mDao.buscar(id));
	}
}
