package com.tns.dao;

import javax.persistence.EntityManager;

import com.tns.entities.student;

public class studentdaoimplementation
{
	private EntityManager entityManager;
	
	public studentdaoimplementation()
	{
		entityManager = jpautil.getEntitymanager(); 
	}
	
	public  void addstudent (student student)
	{
		entityManager.persist(student);
	}
	public  student getstudentbyId (int id)
	{
		return entityManager.find(student.class, id);
	}
	public  void updatestudent (student student)
	{
		entityManager.merge(student);
	}
	public  void removestudent (student student)
	{
		entityManager.remove(student);
	}
	public  void commitTransaction()
	{
		entityManager.getTransaction().commit();
	}
	public  void beginTransaction ()
	{
		entityManager.getTransaction().begin();
	}
}
