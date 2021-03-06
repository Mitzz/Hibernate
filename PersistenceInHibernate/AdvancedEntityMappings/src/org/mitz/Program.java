package org.mitz;

import org.mitz.dao.CategorizedItemDao;
import org.mitz.dao.CategoryDao;
import org.mitz.dao.ItemDao;
import org.mitz.dao.UserDao;
import org.mitz.model.Address;
import org.mitz.model.Bid;
import org.mitz.model.CategorizedItem;
import org.mitz.model.Category;
import org.mitz.model.Item;
import org.mitz.model.User;

public class Program {

	public static void main(String[] args) {
		User user = new User();
		user.setName("Mitz");
		
		Address address = new Address();
		address.setCity("Mumbai");
		address.setStreet("MG ROAD");
		address.setZipCode(400067);
		
		user.setShippingAddress(address);
		
		UserDao userDao = new UserDao();
		CategoryDao categoryDao = new CategoryDao();

		Item item = new Item();
		item.setName("ITEM1");
		user.addBoughtItems(item);
		Bid bid1 = new Bid();
		bid1.setAmount(12);
		item.addBid(bid1);
		
		Bid bid2 = new Bid();
		bid2.setAmount(14);
		item.addBid(bid2);
		
		userDao.create(user);
		
		Category category = new Category();
		category.setName("Category 1");
		categoryDao.create(category);
		CategorizedItem categorizedItem = new CategorizedItem(user.getName(), item, category); 
		new CategorizedItemDao().create(categorizedItem);		
		
		
		
//		item = new ItemDao().retrieve(2l);
//		System.out.println(item.getBuyer());
	}
}
