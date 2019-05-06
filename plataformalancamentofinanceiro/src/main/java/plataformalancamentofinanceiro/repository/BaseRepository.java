package plataformalancamentofinanceiro.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import plataformalancamentofinanceiro.connection.EntityManagerConnection;

public class BaseRepository<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	
//	private static final Logger LOGGER = Logger.getLogger(BaseRepository.class);
	
	private EntityManagerConnection entityManagerConnection;
	
	private EntityManager entityManager;
	
	private EntityTransaction entityTransaction;
	
	public BaseRepository() {
		this.entityManager = EntityManagerConnection.entityManagerConnection();
		this.entityTransaction = entityManager.getTransaction();
	}
	
	public T persist(T object) {
		getBeginTransaction();
			getEntityManager().persist(object);
		getCommitTransaction();
		return object;
	}
	
	public T merge(T object) {
		getBeginTransaction();
			entityManager.merge(object);
		getCommitTransaction();
		return object;
	}
	
	public T remove(T object) {
//		T objectResult = findOne(object, codigo);
		try {
			getBeginTransaction();
				getEntityManager().remove(object);
				getEntityManager().flush();
			getCommitTransaction();
		}catch(Exception e) {
			getRollbackTransaction();
		}
		return object;
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll(T object) {
		Query query = entityManager.createQuery("FROM " + object.getClass().getName());
		return query.getResultList();
	}
	
	public T findOne(Class<T> object, Long codigo) {
		return getEntityManager().find(object, codigo);
	}
	
	public void getBeginTransaction() {
		if(entityManager.getTransaction().isActive() == false) {
			entityManager.getTransaction().begin();
//			getLogger().info("Transação iniciada...");
		}
	}
	
	public void getCommitTransaction() {
		entityManager.getTransaction().commit();
	}
	
	public void getRollbackTransaction() {
		entityManager.getTransaction().rollback();
	}
	
	public void getCloseEntityManager() {
		entityManager.close();
	}
	
	public void getCleanEntityManager() {
		entityManager.clear();
	}
	
	public void getFlushEntityManager() {
		entityManager.flush();
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

//	public static Logger getLogger() {
//		return LOGGER;
//	}

	public EntityManagerConnection getEntityManagerConnection() {
		return entityManagerConnection;
	}

	public void setEntityManagerConnection(EntityManagerConnection entityManagerConnection) {
		this.entityManagerConnection = entityManagerConnection;
	}

	public EntityTransaction getEntityTransaction() {
		return entityTransaction;
	}

	public void setEntityTransaction(EntityTransaction entityTransaction) {
		this.entityTransaction = entityTransaction;
	}

}
