package com.hms.dao;

import com.hms.model.patient;

import org.hibernate.*;

public class PatientDAOImpl implements PatientDAO{

	private SessionFactory sessionFactory;
	
	public PatientDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Override
	public void savePatient(patient p) {
		
		try(Session session = sessionFactory.openSession())
		{
			Transaction t = session.beginTransaction();
			session.save(p);
			t.commit();
		}
		
	}

}
