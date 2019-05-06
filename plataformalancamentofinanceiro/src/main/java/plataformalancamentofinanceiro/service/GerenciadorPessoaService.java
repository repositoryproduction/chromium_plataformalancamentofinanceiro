package plataformalancamentofinanceiro.service;

import java.io.Serializable;
import java.util.List;

import plataformalancamentofinanceiro.dao.GerenciadorPessoaDao;
import plataformalancamentofinanceiro.dao.GerenciadorPessoaDaoInterface;
import plataformalancamentofinanceiro.entity.GerenciadorPessoaEntity;
import plataformalancamentofinanceiro.factory.GerenciadorPessoaFactory;

public class GerenciadorPessoaService implements GerenciadorPessoaDaoInterface, Serializable {

	private static final long serialVersionUID = 1L;
	
	public GerenciadorPessoaDao gerenciadorPessoaDao;
	
	public GerenciadorPessoaFactory gerenciadorPessoaFactory;
	
	public GerenciadorPessoaService() {
		gerenciadorPessoaDao = new GerenciadorPessoaDao();
		gerenciadorPessoaFactory = new GerenciadorPessoaFactory();
	}

	@Override
	public GerenciadorPessoaEntity persist(GerenciadorPessoaEntity gerenciadorPessoaEntity) {
		return gerenciadorPessoaDao.persist(gerenciadorPessoaEntity);
	}

	@Override
	public GerenciadorPessoaEntity delete(GerenciadorPessoaEntity gerenciadorPessoaEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GerenciadorPessoaEntity update(GerenciadorPessoaEntity gerenciadorPessoaEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GerenciadorPessoaEntity> findAll(GerenciadorPessoaEntity gerenciadorPessoaEntity) {
		return gerenciadorPessoaDao.findAll(gerenciadorPessoaEntity);
	}

	@Override
	public GerenciadorPessoaEntity findOne(Long codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GerenciadorPessoaEntity findOne(String nome) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public GerenciadorPessoaDao getGerenciadorPessoaDao() {
		return gerenciadorPessoaDao;
	}

	public void setGerenciadorPessoaDao(GerenciadorPessoaDao gerenciadorPessoaDao) {
		this.gerenciadorPessoaDao = gerenciadorPessoaDao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public GerenciadorPessoaFactory getGerenciadorPessoaFactory() {
		return gerenciadorPessoaFactory;
	}

	public void setGerenciadorPessoaFactory(GerenciadorPessoaFactory gerenciadorPessoaFactory) {
		this.gerenciadorPessoaFactory = gerenciadorPessoaFactory;
	}

	@Override
	public GerenciadorPessoaEntity merge(GerenciadorPessoaEntity gerenciadorPessoaEntity) {
		return gerenciadorPessoaDao.merge(gerenciadorPessoaEntity);
	}
	
}
