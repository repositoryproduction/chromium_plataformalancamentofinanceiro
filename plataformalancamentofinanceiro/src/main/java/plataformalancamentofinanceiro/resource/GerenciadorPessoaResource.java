package plataformalancamentofinanceiro.resource;

import java.io.Serializable;
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

import org.jboss.logging.Logger;

import plataformalancamentofinanceiro.entity.GerenciadorPessoaEntity;
import plataformalancamentofinanceiro.enumeration.TipoPessoaEnumeration;
import plataformalancamentofinanceiro.factory.GerenciadorPessoaFactory;
import plataformalancamentofinanceiro.service.GerenciadorPessoaService;
import plataformalancamentofinanceiro.view.GerenciadorPessoaView;

@Path("gerenciadorPessoaResource")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_ATOM_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class GerenciadorPessoaResource implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOGGER = Logger.getLogger(GerenciadorPessoaResource.class);
	
	private GerenciadorPessoaService gerenciadorPessoaService;
	
	private GerenciadorPessoaView gerenciadorPessoaView;
	
	private GerenciadorPessoaFactory gerenciadorPessoaFactory;
	
	public GerenciadorPessoaResource() {
		gerenciadorPessoaService = new GerenciadorPessoaService();
		gerenciadorPessoaView = new GerenciadorPessoaView();
		gerenciadorPessoaFactory = new GerenciadorPessoaFactory();
	}
	
	@GET
	@Produces({MediaType.TEXT_PLAIN, MediaType.TEXT_HTML, MediaType.APPLICATION_JSON})
	@Path("gerenciadorPessoaResource/{codigo}")
	public String findOne(@PathParam("codigo") Long codigo) {
		return "Codigo: " + codigo;
	}
	
	@GET
	@Path("/")
	public List<GerenciadorPessoaEntity> findAll() {
		return gerenciadorPessoaService.findAll(gerenciadorPessoaView.getGerenciadorPessoaEntity());
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("{nomeUsuarioSistema}/")
	public GerenciadorPessoaEntity findOne(@PathParam("nomeUsuarioSistema") String nomeUsuarioSistema) {
		GerenciadorPessoaEntity gerenciadorPessoaEntity = new GerenciadorPessoaEntity();
			gerenciadorPessoaEntity.setCodigo(1L);
			gerenciadorPessoaEntity.setNome(nomeUsuarioSistema);
			gerenciadorPessoaEntity.setObservacao("");
			gerenciadorPessoaEntity.setIsAtivo(Boolean.TRUE);
			gerenciadorPessoaEntity.setIsFontePagamento(Boolean.TRUE);
			gerenciadorPessoaEntity.setTipoPessoaEnumeration(TipoPessoaEnumeration.PESSOA_FISICA);
		return gerenciadorPessoaEntity;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response persist(GerenciadorPessoaEntity gerenciadorPessoaEntity) {
		gerenciadorPessoaService.persist(GerenciadorPessoaFactory.obterNovaPessoaFisica(gerenciadorPessoaEntity));
			LOGGER.info(gerenciadorPessoaEntity.toString());
		return Response.status(Response.Status.OK).build();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response merge(GerenciadorPessoaEntity gerenciadorPessoaEntity) {
		gerenciadorPessoaService.merge(gerenciadorPessoaEntity);
		return Response.status(Response.Status.OK).build();
	}
	
	@DELETE
	@Path("{codigo}/")
	public Response remove(@PathParam("codigo") Long codigo) {
		gerenciadorPessoaService.remove(codigo);
		LOGGER.info("Dados excluido com sucesso: " + codigo);
		return Response.status(Response.Status.OK).build();
	}

	public GerenciadorPessoaService getGerenciadorPessoaService() {
		return gerenciadorPessoaService;
	}

	public void setGerenciadorPessoaService(GerenciadorPessoaService gerenciadorPessoaService) {
		this.gerenciadorPessoaService = gerenciadorPessoaService;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public static Logger getLogger() {
		return LOGGER;
	}

	public GerenciadorPessoaView getGerenciadorPessoaView() {
		return gerenciadorPessoaView;
	}

	public void setGerenciadorPessoaView(GerenciadorPessoaView gerenciadorPessoaView) {
		this.gerenciadorPessoaView = gerenciadorPessoaView;
	}

	public GerenciadorPessoaFactory getGerenciadorPessoaFactory() {
		return gerenciadorPessoaFactory;
	}

	public void setGerenciadorPessoaFactory(GerenciadorPessoaFactory gerenciadorPessoaFactory) {
		this.gerenciadorPessoaFactory = gerenciadorPessoaFactory;
	}
	
}
