package com.tns.cg.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class IT {

	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction();
		
		Employee empl = new Employee();
		empl.setName("Jayesh");
		empl.setSalary(1000.0D);
		em.persist(empl);
		
		ManagerCG mgr = new ManagerCG();
		mgr.setName("Pranit");
		mgr.setSalary(1200.0D);
		mgr.setDepartmentName("Acc");
		
	
		System.out.println("Added One Employee and One Manager to database");
//		em.getTransaction().commit();
//		em.close();
//		factory.close();
		
				

	}

}
