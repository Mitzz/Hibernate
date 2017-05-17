package org.mitz.dao;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.mitz.hibernate.HibernateUtil;
import org.mitz.model.CategorizedItem;

public class CategorizedItemDao {

	SessionFactory sf = HibernateUtil.getSessionFactory();

	public CategorizedItem create(CategorizedItem categorizedItem) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(categorizedItem);

		transaction.commit();
		session.close();
		return categorizedItem;
	}

	public CategorizedItem retrieve(long id) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();

		CategorizedItem categorizedItem = (CategorizedItem) session.get(CategorizedItem.class, id);
		transaction.commit();
		session.close();
		return categorizedItem;
	}
}
