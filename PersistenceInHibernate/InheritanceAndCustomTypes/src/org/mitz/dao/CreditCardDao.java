package org.mitz.dao;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.mitz.hibernate.HibernateUtil;
import org.mitz.model.CreditCard;

public class CreditCardDao {

	public CreditCard create(CreditCard cc){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(cc);
		
		transaction.commit();
		session.close();
		return cc;
	}
	
	public CreditCard retrive(long id){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		CreditCard cc = (CreditCard) session.get(CreditCard.class, id);
		
		transaction.commit();
		session.close();
		return cc;
	}
}
