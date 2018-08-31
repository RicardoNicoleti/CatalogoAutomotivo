package br.edu.unifacear.catalogoautomotivo.test;

import org.junit.Ignore;
import org.junit.Test;

import br.edu.unifacear.catalogoautomotivo.dao.ModeloDAO;
import br.edu.unifacear.catalogoautomotivo.dao.PecaDAO;
import br.edu.unifacear.catalogoautomotivo.entity.Peca;
import br.edu.unifacear.catalogoautomotivo.entity.PecaModelo;

public class PecaTest {
	
	@Test
	@Ignore
	public void inserir() {
		Long idModelo = 1L; 
		ModeloDAO mDao = new ModeloDAO();
		Peca peca = new Peca();
		peca.setCodigoPeca("CODPECA01");
		peca.setNome("Peca 1");
		peca.setPreco(50.00);
		peca.setFoto("./Foto/Peca.png");
		peca.setQuantidadeEstoque((short)10);
		
		PecaModelo pecaModelo = new PecaModelo();
		pecaModelo.setModelo(mDao.buscar(idModelo));
		
		pecaModelo.setPeca(peca);
		peca.getListaPecaModelo().add(pecaModelo);

		PecaDAO pDao = new PecaDAO();
		
		pDao.salvar(peca);
	}
	@Test
	@Ignore
	public void editar() {
		
	}
	@Test
	@Ignore
	public void excluir() {
		
	}
	@Test
	@Ignore
	public void listar() {
		
		
	}
	@Test
	//@Ignore
	public void buscar() {
		PecaDAO pDao = new PecaDAO();
		System.out.println(pDao.buscar(1L));
		
	}
	
	
}
