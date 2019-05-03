package plataformalancamentofinanceiro.test;

import java.io.Serializable;

import org.jboss.logging.Logger;

import plataformalancamentofinanceiro.entity.GerenciadorPessoaEntity;
import plataformalancamentofinanceiro.service.GerenciadorPessoaService;

public class GerenciadorPessoaServiceTest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private static final Logger LOGGER = Logger.getLogger(GerenciadorPessoaServiceTest.class);
	
	public static void main(String[] args) {
		findAll();
	}
	
	public static void findAll() {
		GerenciadorPessoaEntity gerenciadorPessoaEntity = new GerenciadorPessoaEntity();
		GerenciadorPessoaService gerenciadorPessoaService = new GerenciadorPessoaService();
		for(GerenciadorPessoaEntity gerenciadorPessoaDomainResult : gerenciadorPessoaService.findAll(gerenciadorPessoaEntity)) {
			LOGGER.info("Codigo: " + gerenciadorPessoaDomainResult.getCodigo() + "\n" +
					    "Nome: " + gerenciadorPessoaDomainResult.getNome() + "\n" +
					    "Ativo: " + gerenciadorPessoaDomainResult.getIsAtivo() + "\n" +
					    "Fonte pagamento: " + gerenciadorPessoaDomainResult.getIsFontePagamento() + "\n" + 
					    "Tipo Pessoa" + gerenciadorPessoaDomainResult.getTipoPessoaEnumeration() + "\n \n");
		}
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static Logger getLogger() {
		return LOGGER;
	}
	
}
