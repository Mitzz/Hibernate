package org.mitz.dao;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.mitz.hibernate.HibernateUtil;
import org.mitz.model.Category;

public class CategoryDao {
	SessionFactory sf = HibernateUtil.getSessionFactory();
	
	public Category create(Category category){
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(category);
		
		transaction.commit();
		session.close();
		return category;
	}
	
	public Category retrieve(long id) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		Category category = (Category) session.get(Category.class, id);
		transaction.commit();
		session.close();
		return category;
	}
	
	public void delete(long id) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		Category category = (Category) session.load(Category.class, id);
		session.delete(category);
		transaction.commit();
		session.close();
	}
}
