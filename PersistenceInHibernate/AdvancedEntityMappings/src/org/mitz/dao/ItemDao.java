package org.mitz.dao;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.mitz.hibernate.HibernateUtil;
import org.mitz.model.Item;

public class ItemDao {
	SessionFactory sf = HibernateUtil.getSessionFactory();
	
	public Item create(Item item){
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(item);
		
		transaction.commit();
		session.close();
		return item;
	}
	
	public Item retrieve(long id) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		Item item = (Item) session.get(Item.class, id);
		transaction.commit();
		session.close();
		return item;
	}
	
	public void delete(long id) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		Item ent = (Item) session.load(Item.class, id);
		session.delete(ent);
		transaction.commit();
		session.close();
	}
}
