package com.tns.dao;

import com.tns.entities.student;

public interface studentimpl 
{
	public abstract void addstudent (student student);
	public abstract student getstudentbyId (int id);
	public abstract void updatestudent (student student);
	public abstract void removestudent (student student);
	public abstract void commitTransaction();
	public abstract void beginTransaction ();
}
