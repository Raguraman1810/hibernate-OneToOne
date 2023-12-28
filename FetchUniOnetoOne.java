package OneToOne_db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchUniOnetoOne {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Person p = em.find(Person.class,1);
		System.out.println(p);
		
		Aadhar a = em.find(Aadhar.class, 638819346477l);
	    System.out.println(a);
		
	}

}
