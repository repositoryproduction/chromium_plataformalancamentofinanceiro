package plataformalancamentofinanceiro.factory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import plataformalancamentofinanceiro.entity.GerenciadorPessoaDomain;
import plataformalancamentofinanceiro.enumeration.TipoPessoaEnumeration;

public class GerenciadorPessoaFactory implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public GerenciadorPessoaFactory() { }
	
	public static GerenciadorPessoaDomain obterNovaPessoaFisica() {
		GerenciadorPessoaDomain gerenciadorPessoaDomain = new GerenciadorPessoaDomain();
			gerenciadorPessoaDomain.setCodigo(null);
			gerenciadorPessoaDomain.setNome(null);
			gerenciadorPessoaDomain.setObservacao(null);
			gerenciadorPessoaDomain.setIsAtivo(Boolean.TRUE);
			gerenciadorPessoaDomain.setIsFontePagamento(Boolean.TRUE);
			gerenciadorPessoaDomain.setTipoPessoaEnumeration(TipoPessoaEnumeration.PESSOA_FISICA);
		return gerenciadorPessoaDomain;
	}
	
	public static GerenciadorPessoaDomain obterNovaPessoaFisica(GerenciadorPessoaDomain gerenciadorPessoaDomainParameter) {
		GerenciadorPessoaDomain gerenciadorPessoaDomain = new GerenciadorPessoaDomain();
			gerenciadorPessoaDomain.setCodigo(null);
			gerenciadorPessoaDomain.setNome(gerenciadorPessoaDomainParameter.getNome());
			gerenciadorPessoaDomain.setObservacao(gerenciadorPessoaDomainParameter.getObservacao());
			gerenciadorPessoaDomain.setIsAtivo(Boolean.TRUE);
			gerenciadorPessoaDomain.setIsFontePagamento(Boolean.TRUE);
			gerenciadorPessoaDomain.setTipoPessoaEnumeration(TipoPessoaEnumeration.PESSOA_FISICA);
		return gerenciadorPessoaDomain;
	}
	
	public static List<GerenciadorPessoaDomain> findAll() {
		List<GerenciadorPessoaDomain> gerenciadorPessoaDomainList = new ArrayList<GerenciadorPessoaDomain>();
			gerenciadorPessoaDomainList.add(obterNovaPessoaFisica(obterNovaPessoaFisica()));
		return gerenciadorPessoaDomainList;
	}
	
}
