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
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import models.Home;
import models.Toy;

public class HomeHelper {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("week6");
	
	public void persist(Home model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void delete(Home model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(Home.class, model.getHomeId()));
		manager.getTransaction().commit();
		manager.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Home> showAllHomes() {
		EntityManager manager = factory.createEntityManager();
		manager.clear();
		Query q = manager.createQuery("SELECT i FROM home i");
		List<Home> allItems = q.getResultList();
		manager.close();
		return allItems;
		
	}

	public void update(Home model) {
		EntityManager manager = factory.createEntityManager();
		Home dbEntity = manager.find(Home.class, model.getHomeId());
		manager.getTransaction().begin();
		dbEntity.setName(model.getName());
		dbEntity.setLocation(model.getLocation());
		manager.getTransaction().commit();
		manager.close();
		
	}

	public Home searchHomeByName(String name) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Home> query = manager.createQuery("SELECT i FROM home AS i WHERE i.name = :name", Home.class);
		query.setParameter("name", name);
		Home dbEntity = query.getSingleResult();
		manager.close();
		return dbEntity;
	}

}
