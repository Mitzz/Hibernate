package org.mitz.dao;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.mitz.hibernate.HibernateUtil;
import org.mitz.model.User;

public class UserDao {

	public void create(User user){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(user);
		
		transaction.commit();
		session.close();
		sf.close();
	}

	public User retrieve(long id) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		User user = (User) session.get(User.class, id);
		
		transaction.commit();
		session.close();
		sf.close();
		
		return user;
	}
}
