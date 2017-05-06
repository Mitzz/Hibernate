package org.mitz;

import org.mitz.dao.UserDao;
import org.mitz.model.User;

public class Program {

	public static void main(String[] args) {
		UserDao dao = new UserDao();
		User user = dao.retrieve(2L);
		System.out.println(user);
	}
}
