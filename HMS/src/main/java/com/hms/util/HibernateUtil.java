package com.hms.util;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class HibernateUtil {

	private static  SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory()
	{
		try
		{
		return new Configuration().configure().buildSessionFactory();
				
		}catch(ExceptionInInitializerError e)
		{
			System.err.println(e.getMessage());
			throw new ExceptionInInitializerError();
		}
	}
	
	public static SessionFactory getSessionFactoy()
	{
		return sessionFactory;
	}
	
}
