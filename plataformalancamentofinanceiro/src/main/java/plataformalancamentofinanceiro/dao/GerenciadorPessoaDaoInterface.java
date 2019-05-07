package plataformalancamentofinanceiro.dao;

import java.util.List;

import plataformalancamentofinanceiro.entity.GerenciadorPessoaEntity;

public interface GerenciadorPessoaDaoInterface {
	public GerenciadorPessoaEntity persist(GerenciadorPessoaEntity gerenciadorPessoaEntity);
	public GerenciadorPessoaEntity remove(Long codigo);
	public GerenciadorPessoaEntity update(GerenciadorPessoaEntity gerenciadorPessoaEntity);
	public GerenciadorPessoaEntity merge(GerenciadorPessoaEntity gerenciadorPessoaEntity);
	public List<GerenciadorPessoaEntity> findAll(GerenciadorPessoaEntity gerenciadorPessoaEntity);
	public GerenciadorPessoaEntity findOne(Long codigo);
	public GerenciadorPessoaEntity findOne(String nome);
}
