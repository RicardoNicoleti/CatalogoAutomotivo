package br.edu.unifacear.catalogoautomotivo.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.edu.unifacear.catalogoautomotivo.business.PecaBusiness;
import br.edu.unifacear.catalogoautomotivo.entity.Peca;

@Path("Peca")
public class PecaService {
	@POST
	@Path("/inserirPeca")
	@Produces(MediaType.APPLICATION_JSON)
	public Response inserir(Peca Peca) {
		PecaBusiness PecaBusiness = new PecaBusiness();
		PecaBusiness.inserir(Peca);
		System.out.println(Peca);
		return Response.status(200).entity(Peca).build();

	}
	
	@PUT 
	@Path("/editarPeca")
	@Produces(MediaType.APPLICATION_JSON)
	public Response editar(Peca Peca) {
		PecaBusiness PecaBusiness = new PecaBusiness();
		PecaBusiness.editar(Peca);
		return Response.status(200).entity(Peca).build();
	}

	@DELETE
	@Path("/excluirPeca")
	@Produces(MediaType.APPLICATION_JSON)
	public Response excluir(@QueryParam("id") Long id) {
		PecaBusiness PecaBusiness = new PecaBusiness();
		PecaBusiness.excluir(id);
		return Response.status(200).entity(id).build();

	}
	
	@GET
	@Path("/listarPecas")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listar() {
		PecaBusiness PecaBusiness = new PecaBusiness();
		return Response.status(200).entity(PecaBusiness.listarPecas()).build();

	}
	
	@GET
	@Path("/buscarPeca")
	@Produces(MediaType.APPLICATION_JSON)
	public Response obterPorId(@QueryParam("id") Long id) {
		PecaBusiness PecaBusiness = new PecaBusiness();
		return Response.status(200).entity(PecaBusiness.buscar(id)).build();

	}
}
