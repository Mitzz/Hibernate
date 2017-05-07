package org.mitz;

import org.mitz.dao.BidDao;
import org.mitz.dao.ItemDao;
import org.mitz.model.Bid;
import org.mitz.model.Item;

public class Program {

	public static void main(String[] args) {
		BidDao bidDao = new BidDao();
		ItemDao itemDao = new ItemDao();
		Item item = new Item();
		item.setName("ITEM1");
		
		Bid bid = new Bid();
		bid.setAmount(12);
		bid.setItem(item);
		
		itemDao.create(item); //This is necessary
		bidDao.create(bid);
		
		bid = new Bid();
		bid.setAmount(14);
		bid.setItem(item);
		
		bidDao.create(bid);

		
	}
}
