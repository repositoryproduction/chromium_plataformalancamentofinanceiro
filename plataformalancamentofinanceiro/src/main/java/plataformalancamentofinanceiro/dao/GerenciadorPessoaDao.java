package plataformalancamentofinanceiro.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import plataformalancamentofinanceiro.entity.GerenciadorPessoaEntity;
import plataformalancamentofinanceiro.repository.BaseRepository;

public class GerenciadorPessoaDao extends BaseRepository<GerenciadorPessoaEntity> implements GerenciadorPessoaDaoInterface, Serializable {

	private static final long serialVersionUID = 1L;
	
	public BaseRepository<GerenciadorPessoaEntity> baseRepository;
	
	public GerenciadorPessoaDao() {
		baseRepository = new BaseRepository<GerenciadorPessoaEntity>();
	}

	@Override
	public GerenciadorPessoaEntity persist(GerenciadorPessoaEntity gerenciadorPessoaEntity) {
		return baseRepository.persist(gerenciadorPessoaEntity);
	}

	@Override
	public GerenciadorPessoaEntity update(GerenciadorPessoaEntity gerenciadorPessoaEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<GerenciadorPessoaEntity> findAll(GerenciadorPessoaEntity gerenciadorPessoaEntity) {
		StringBuilder stringBuilder = new StringBuilder("SELECT gerenciadorPessoaEntity_ ")
				.append("FROM GerenciadorPessoaEntity gerenciadorPessoaEntity_ ");
		Query query = baseRepository.getEntityManager().createQuery(stringBuilder.toString());
		return query.getResultList();
	}
	
	@Override
	public GerenciadorPessoaEntity remove(Long codigo) {
		getBeginTransaction();
			getEntityManager().remove(findOne(codigo));
		getCommitTransaction();
		return null;
	}

	@Override
	public GerenciadorPessoaEntity findOne(Long codigo) {
		StringBuilder stringBuilder = new StringBuilder()
			.append("SELECT gerenciadorPessoaEntity_ ")
			.append("FROM GerenciadorPessoaEntity gerenciadorPessoaEntity_ ")
			.append("WHERE gerenciadorPessoaEntity_.codigo = :codigo ");
		Query query = getEntityManager().createQuery(stringBuilder.toString());
			query.setParameter("codigo", codigo);
		return (GerenciadorPessoaEntity) query.getSingleResult();
	}

	@Override
	public GerenciadorPessoaEntity findOne(String nome) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Long recuperarIdentificador() {
		StringBuilder stringBuilder = new StringBuilder()
			.append("SELECT MAX(gerenciadorPessoaEntity_.codigo + 1) ")
			.append("FROM GerenciadorPessoaEntity gerenciadorPessoaEntity_ ");
		Query query = getEntityManager().createQuery(stringBuilder.toString());
		return (Long) query.getSingleResult();
	}

}
