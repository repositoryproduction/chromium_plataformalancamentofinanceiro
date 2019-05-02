package plataformalancamentofinanceiro.resource;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import plataformalancamentofinanceiro.entity.GerenciadorPessoaDomain;
import plataformalancamentofinanceiro.enumeration.TipoPessoaEnumeration;

@Path("gerenciadorPessoaResource")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_ATOM_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class GerenciadorPessoaResource implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOGGER = Logger.getLogger(GerenciadorPessoaResource.class);

	public GerenciadorPessoaResource() { }
	
	@GET
	@Produces({MediaType.TEXT_PLAIN, MediaType.TEXT_HTML, MediaType.APPLICATION_JSON})
	@Path("gerenciadorPessoaResource/{codigo}")
	public String findOne(@PathParam("codigo") Long codigo) {
		return "Codigo: " + codigo;
	}
	
	@GET
	@Path("/")
	public List<GerenciadorPessoaDomain> findAll() {
		GerenciadorPessoaDomain gerenciadorPessoaDomainHassya = new GerenciadorPessoaDomain();
			gerenciadorPessoaDomainHassya.setCodigo(1L);
			gerenciadorPessoaDomainHassya.setNome("Hassya Havivah");
			gerenciadorPessoaDomainHassya.setObservacao("");
			gerenciadorPessoaDomainHassya.setIsAtivo(Boolean.TRUE);
			gerenciadorPessoaDomainHassya.setIsFontePagamento(Boolean.TRUE);
			gerenciadorPessoaDomainHassya.setTipoPessoaEnumeration(TipoPessoaEnumeration.PESSOA_FISICA);
		GerenciadorPessoaDomain gerenciadorPessoaDomainQuintinn = new GerenciadorPessoaDomain();
			gerenciadorPessoaDomainQuintinn.setCodigo(2L);
			gerenciadorPessoaDomainQuintinn.setNome("José Quintin");
			gerenciadorPessoaDomainQuintinn.setObservacao(null);
			gerenciadorPessoaDomainQuintinn.setIsAtivo(Boolean.TRUE);
			gerenciadorPessoaDomainQuintinn.setIsFontePagamento(Boolean.TRUE);
			gerenciadorPessoaDomainQuintinn.setTipoPessoaEnumeration(TipoPessoaEnumeration.PESSOA_FISICA);
		List<GerenciadorPessoaDomain> gerenciadorPessoaDomainList = new ArrayList<GerenciadorPessoaDomain>();
			gerenciadorPessoaDomainList.add(gerenciadorPessoaDomainHassya);
			gerenciadorPessoaDomainList.add(gerenciadorPessoaDomainQuintinn);
		return gerenciadorPessoaDomainList;
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("{nomeUsuarioSistema}/")
	public GerenciadorPessoaDomain findOne(@PathParam("nomeUsuarioSistema") String nomeUsuarioSistema) {
		GerenciadorPessoaDomain gerenciadorPessoaDomain = new GerenciadorPessoaDomain();
			gerenciadorPessoaDomain.setCodigo(1L);
			gerenciadorPessoaDomain.setNome(nomeUsuarioSistema);
			gerenciadorPessoaDomain.setObservacao("");
			gerenciadorPessoaDomain.setIsAtivo(Boolean.TRUE);
			gerenciadorPessoaDomain.setIsFontePagamento(Boolean.TRUE);
			gerenciadorPessoaDomain.setTipoPessoaEnumeration(TipoPessoaEnumeration.PESSOA_FISICA);
		return gerenciadorPessoaDomain;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response persist(GerenciadorPessoaDomain gerenciadorPessoaDomain) {
			LOGGER.info(gerenciadorPessoaDomain.getCodigo());
			LOGGER.info(gerenciadorPessoaDomain.getNome());
			LOGGER.info(gerenciadorPessoaDomain.getIsAtivo());
			LOGGER.info(gerenciadorPessoaDomain.getIsFontePagamento());
			LOGGER.info(gerenciadorPessoaDomain.getObservacao());
			LOGGER.info(gerenciadorPessoaDomain.getTipoPessoaEnumeration());
			LOGGER.info(gerenciadorPessoaDomain.toString());
		return Response.status(Response.Status.OK).build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response merge(GerenciadorPessoaDomain gerenciadorPessoaDomain) {
			LOGGER.info(gerenciadorPessoaDomain.getCodigo());
			LOGGER.info(gerenciadorPessoaDomain.getNome());
			LOGGER.info(gerenciadorPessoaDomain.getIsAtivo());
			LOGGER.info(gerenciadorPessoaDomain.getIsFontePagamento());
			LOGGER.info(gerenciadorPessoaDomain.getObservacao());
			LOGGER.info(gerenciadorPessoaDomain.getTipoPessoaEnumeration());
			LOGGER.info(gerenciadorPessoaDomain.toString());
		return Response.status(Response.Status.OK).build();
	}
	
	@DELETE
	@Path("{codigo}/")
	public Response remove(@PathParam("codigo") Long codigo) {
		LOGGER.info("Dados excluido com sucesso: " + codigo);
		return Response.status(Response.Status.OK).build();
	}
	
	public static Logger getLogger() {
		return LOGGER;
	}
	
}
