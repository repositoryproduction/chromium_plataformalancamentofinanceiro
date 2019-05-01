package plataformalancamentofinanceiro.application;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("plataformalancamentofinanceiro")
public class ApplicationRest extends ResourceConfig {
	
	public ApplicationRest() {
		packages("plataformalancamentofinanceiro.resource");
	}
	
}
