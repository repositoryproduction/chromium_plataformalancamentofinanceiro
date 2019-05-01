package plataformalancamentofinanceiro.resource;

import java.io.Serializable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("gerenciadorPessoaResource")
public class GerenciadorPessoaResource implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String retornarMensagem(@QueryParam("nomeUsuarioSistema") String nomeUsuarioSistema) {
		return "Perfil de Acesso do usuario " + nomeUsuarioSistema;
	}
	
	@GET
	@Produces({MediaType.TEXT_PLAIN, MediaType.TEXT_HTML})
	@Path("gerenciadorPessoaResource/{codigo}")
	public String findOne(@PathParam("codigo") Long codigo) {
		return "Codigo: " + codigo;
	}
	
}
