/**
 * @author Noah - Arterburn
 * CIS175 - Fall 2023
 * Oct 5, 2023
 */
package helpers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import models.Toy;

public class ToyHelper {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("week6");
	HomeHelper homeHelper = new HomeHelper();
	
	public void persist(Toy model) {
		EntityManager manager = factory.createEntityManager();
		model.setHome(homeHelper.searchHomeByName(model.getHome().getName()));
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void delete(Toy model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(Toy.class, model.getToyId()));
		manager.getTransaction().commit();
		manager.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Toy> showAllToys() {
		EntityManager manager = factory.createEntityManager();
		List<Toy> allItems = manager.createQuery("SELECT i FROM toys i").getResultList();
		manager.close();
		return allItems;
		
	}

	public void update(Toy model) {
		EntityManager manager = factory.createEntityManager();
		model.setHome(homeHelper.searchHomeByName(model.getHome().getName()));
		Toy dbEntity = manager.find(Toy.class, model.getToyId());
		manager.getTransaction().begin();
		dbEntity.setStoreName(model.getStoreName());
		dbEntity.setCommonName(model.getCommonName());
		dbEntity.setSize(model.getSize());
		dbEntity.setHome(model.getHome());
		manager.getTransaction().commit();
		manager.close();
		
	}

	public Toy searchToyByName(String oldName) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Toy> query = manager.createQuery("SELECT i FROM toys AS i WHERE i.commonName = :commonName", Toy.class);
		query.setParameter("commonName", oldName);
		Toy dbEntity = query.getSingleResult();
		manager.close();
		return dbEntity;
	}

}
