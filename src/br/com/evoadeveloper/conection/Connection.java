package br.com.evoadeveloper.conection;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Connection implements IConnection {

	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private String queryString = "";

	public Connection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("bd_promocao");
		entityManager = entityManagerFactory.createEntityManager();
	}

	@Override
	public void add(Object pObject) throws Exception {
		entityManager.getTransaction().begin();
		entityManager.persist(pObject);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@Override
	public void update(Object pObject) throws Exception {
		entityManager.getTransaction().begin();
		entityManager.merge(pObject);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@Override
	public void delete(Object pObject) throws Exception {
		entityManager.getTransaction().begin();
		entityManager.remove(pObject);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@Override
	public Object find(Object pObject, String pParametro) throws Exception {
		return entityManager.find(pObject.getClass(), pParametro);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Object> list(Object pObject) throws Exception {
		return entityManager.createQuery("FROM " + pObject.getClass().getSimpleName()).getResultList();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Object> listAllValidPromotions(Date pDate) throws Exception {
		queryString ="SELECT p FROM Promotion p "+"WHERE p.promotion_final_date <= :pDate";
		Query query = entityManager.createQuery(queryString);
		query.setParameter("pDate", pDate);
		return query.getResultList();
	}
}
