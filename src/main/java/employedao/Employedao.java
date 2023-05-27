package employedao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import employedto.Employedto;

public class Employedao {
 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
 EntityManager entityManager= entityManagerFactory.createEntityManager();
 EntityTransaction entityTransaction = entityManager.getTransaction();
 
 public void signup(Employedto dto1) {
	 entityTransaction.begin();
	 entityManager.persist(dto1);
	 entityTransaction.commit();	
}
 
 public Employedto login(String email) {
	 Employedto dto =entityManager.find(Employedto.class, email);
	 return dto;
 }
}
