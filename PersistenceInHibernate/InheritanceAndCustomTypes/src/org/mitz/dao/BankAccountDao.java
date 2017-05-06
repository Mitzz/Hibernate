package org.mitz.dao;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.mitz.hibernate.HibernateUtil;
import org.mitz.model.BankAccount;

public class BankAccountDao {
	SessionFactory sf = HibernateUtil.getSessionFactory();
	
	public BankAccount create(BankAccount bankAccount){
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(bankAccount);
		
		transaction.commit();
		session.close();
		return bankAccount;
	}
	
	public BankAccount retrive(long id){
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		BankAccount bankAccount = (BankAccount) session.get(BankAccount.class, id);
		
		transaction.commit();
		session.close();
		return bankAccount;
	}
}
