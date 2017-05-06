package org.mitz;

import org.mitz.dao.UserDao;
import org.mitz.model.Address;
import org.mitz.model.User;

public class Program {

	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		
		User user = new User();
		
		Address home = new Address();
		home.setCity("Thane");
		home.setStreet("MG Road");
		home.setZipcode("400067");
		
		Address billing = new Address();
		billing.setCity("Thane");
		billing.setStreet("Ghatkopar");
		billing.setZipcode("400060");
		
		user.setFirstName("Kunal");
		user.setLastName("Bhansali");
		user.setHomeAddress(home);
		user.setBillingAddress(billing);
		
		userDao.create(user);
	}
}
