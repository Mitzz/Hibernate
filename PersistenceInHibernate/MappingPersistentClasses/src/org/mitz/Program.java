package org.mitz;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.mitz.hibernate.HibernateUtil;
import org.mitz.model.Address;
import org.mitz.model.User;

public class Program {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		User user = new User();
		
		Address home = new Address();
		home.setCity("Mumbai");
		home.setStreet("MG Road");
		home.setZipcode("400067");
		
		Address billing = new Address();
		billing.setCity("Mumbai");
		billing.setStreet("Western Expressway");
		billing.setZipcode("400060");
		
		user.setFirstName("Mithul");
		user.setLastName("Bhansali");
		user.setHomeAddress(home);
		user.setBillingAddress(billing);
		
		session.save(user);
		
		transaction.commit();
		session.close();
		sf.close();
		
	}
}
