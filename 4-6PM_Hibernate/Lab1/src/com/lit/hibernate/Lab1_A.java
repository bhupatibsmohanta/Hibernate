package com.lit.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Lab1_A 
{
	public static void main(String[] args) 
	{
		try
		{
			Configuration cfg=new Configuration();
			cfg=cfg.configure();
			SessionFactory factory=cfg.buildSessionFactory();
			
			Session session=factory.openSession();
			org.hibernate.Transaction tx=session.beginTransaction();
			
			Student s1=new Student("Raja",6.5,8000L);
			session.save(s1);
			tx.commit();
			session.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
