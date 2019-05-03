package plataformalancamentofinanceiro.factory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import plataformalancamentofinanceiro.entity.GerenciadorPessoaEntity;
import plataformalancamentofinanceiro.enumeration.TipoPessoaEnumeration;

public class GerenciadorPessoaFactory implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public GerenciadorPessoaFactory() { }
	
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
	
	public static GerenciadorPessoaEntity obterNovaPessoaFisica(GerenciadorPessoaEntity gerenciadorPessoaDomainParameter) {
		GerenciadorPessoaEntity gerenciadorPessoaEntity = new GerenciadorPessoaEntity();
			gerenciadorPessoaEntity.setCodigo(null);
			gerenciadorPessoaEntity.setNome(gerenciadorPessoaDomainParameter.getNome());
			gerenciadorPessoaEntity.setObservacao(gerenciadorPessoaDomainParameter.getObservacao());
			gerenciadorPessoaEntity.setIsAtivo(Boolean.TRUE);
			gerenciadorPessoaEntity.setIsFontePagamento(Boolean.TRUE);
			gerenciadorPessoaEntity.setTipoPessoaEnumeration(TipoPessoaEnumeration.PESSOA_FISICA);
		return gerenciadorPessoaEntity;
	}
	
	public static List<GerenciadorPessoaEntity> findAll() {
		List<GerenciadorPessoaEntity> gerenciadorPessoaDomainList = new ArrayList<GerenciadorPessoaEntity>();
			gerenciadorPessoaDomainList.add(obterNovaPessoaFisica(obterNovaPessoaFisica()));
		return gerenciadorPessoaDomainList;
	}
	
}
