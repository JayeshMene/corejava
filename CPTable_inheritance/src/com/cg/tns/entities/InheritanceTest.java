package com.cg.tns.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class InheritanceTest {

	public static void main(String[] args) 
	{
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one employee
		Employee employee = new Employee();
		employee.setName("John");
		employee.setSalary(800);
		em.persist(employee);
		
		//create one manager
		Manager manager = new Manager();
		manager.setName("Remo");
		manager.setSalary(1000);
		manager.setDepartmentName("Sales");
		em.persist(manager);
		
		System.out.println("Added one employee and manager to database");
		
		//em.getTransaction().commit();
		//em.close();
		//factory.close();
	}

}
