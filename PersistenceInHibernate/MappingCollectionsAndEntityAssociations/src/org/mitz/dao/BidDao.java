package org.mitz.dao;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.mitz.hibernate.HibernateUtil;
import org.mitz.model.Bid;

public class BidDao {
	SessionFactory sf = HibernateUtil.getSessionFactory();

	public Bid create(Bid bid) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(bid);

		transaction.commit();
		session.close();
		return bid;
	}

	public Bid retrieve(long id) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();

		Bid bid = (Bid) session.get(Bid.class, id);
		transaction.commit();
		session.close();
		return bid;
	}
}
