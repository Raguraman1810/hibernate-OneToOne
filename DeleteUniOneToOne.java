package OneToOne_db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteUniOneToOne {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = em.find(Person.class, 2);
		Aadhar a = p.getCard();
		
		try {
		et.begin();
		em.remove(p);
		em.remove(a);
		et.commit();
		System.out.println("data deleted");
		}catch(Exception e) {
			e.printStackTrace();
			et.rollback();
		}
	}

}
