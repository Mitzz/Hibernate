package org.mitz;

import org.mitz.dao.UserDao;
import org.mitz.model.Address;
import org.mitz.model.User;

public class Program {

	public static void main(String[] args) {
		UserDao dao = new UserDao();
		
		User user = new User();
		user.setName("Mithul");
		
		Address shipping = new Address();
		shipping.setCity("MUMBAI");
		shipping.setStreet("MG ROAD");
		shipping.setZipCode(400067);
		
		user.setShippingAddress(shipping);
		
		dao.create(user);
		
	}
}
