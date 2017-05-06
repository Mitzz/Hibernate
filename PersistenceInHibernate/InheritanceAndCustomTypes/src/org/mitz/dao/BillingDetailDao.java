package org.mitz.dao;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.mitz.hibernate.HibernateUtil;
import org.mitz.model.BillingDetails;

public class BillingDetailDao {
	SessionFactory sf = HibernateUtil.getSessionFactory();
	
	public BillingDetails create(BillingDetails billDetail){
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(billDetail);
		
		transaction.commit();
		session.close();
		return billDetail;
	}
	
	public BillingDetails retrive(long id){
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		BillingDetails billDetail = (BillingDetails) session.get(BillingDetails.class, id);
		
		transaction.commit();
		session.close();
		return billDetail;
	}
}
