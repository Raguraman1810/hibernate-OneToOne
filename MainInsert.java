package OneToOne_db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainInsert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Aadhar a = new Aadhar();
		a.setAdno(638819346477l);
		a.setDob("18/10/2001");
		a.setMobile(6381579252l);
		a.setAddress("Chennai");
		
		Person p = new Person();
		p.setName("Raguraman");
		p.setGender("male");
		p.setCard(a);
		
		try {
			et.begin();
			em.persist(p);
			em.persist(a);
			et.commit();
			System.out.println("Data Saved");
		}catch(Exception e) {
			e.printStackTrace();
			et.rollback();
		}
	}

}
