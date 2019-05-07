package plataformalancamentofinanceiro.factory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import plataformalancamentofinanceiro.entity.GerenciadorPessoaEntity;
import plataformalancamentofinanceiro.enumeration.TipoPessoaEnumeration;
import plataformalancamentofinanceiro.service.GerenciadorPessoaService;

public class GerenciadorPessoaFactory implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private static GerenciadorPessoaService gerenciadorPessoaService;
	
	public GerenciadorPessoaFactory() {
		gerenciadorPessoaService = new GerenciadorPessoaService();
	}

	public static GerenciadorPessoaEntity obterNovaPessoaFisica() {
		GerenciadorPessoaEntity gerenciadorPessoaEntity = new GerenciadorPessoaEntity();
			gerenciadorPessoaEntity.setCodigo(null);
			gerenciadorPessoaEntity.setNome(null);
			gerenciadorPessoaEntity.setObservacao(null);
			gerenciadorPessoaEntity.setIsAtivo(Boolean.TRUE);
			gerenciadorPessoaEntity.setIsFontePagamento(Boolean.TRUE);
			gerenciadorPessoaEntity.setTipoPessoaEnumeration(TipoPessoaEnumeration.PESSOA_FISICA);
		return gerenciadorPessoaEntity;
	}
	
	public static GerenciadorPessoaEntity obterNovaPessoaFisica(GerenciadorPessoaEntity gerenciadorPessoaEntity) {
			gerenciadorPessoaEntity.setIsAtivo(Boolean.TRUE);
		return gerenciadorPessoaEntity;
	}
	
	public static List<GerenciadorPessoaEntity> findAll() {
		List<GerenciadorPessoaEntity> gerenciadorPessoaDomainList = new ArrayList<GerenciadorPessoaEntity>();
			gerenciadorPessoaDomainList.add(obterNovaPessoaFisica(obterNovaPessoaFisica()));
		return gerenciadorPessoaDomainList;
	}

	public static GerenciadorPessoaService getGerenciadorPessoaService() {
		return gerenciadorPessoaService;
	}

	public static void setGerenciadorPessoaService(GerenciadorPessoaService gerenciadorPessoaService) {
		GerenciadorPessoaFactory.gerenciadorPessoaService = gerenciadorPessoaService;
	}
	
}
