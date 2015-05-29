package com.dbg;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dbg.model.test.Test;

public class Main {

	public enum PersistenceManager {
		INSTANCE;

		private EntityManagerFactory emFactory;

		private PersistenceManager() {
			emFactory = Persistence.createEntityManagerFactory("jpa");
		}

		public EntityManager getEntityManager() {
			return emFactory.createEntityManager();
		}

		public void close() {
			emFactory.close();
		}
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.setName("prueba");

		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.getTransaction().begin();
		em.persist(test);
		em.getTransaction().commit();

		em.close();
		PersistenceManager.INSTANCE.close();
	}

}
