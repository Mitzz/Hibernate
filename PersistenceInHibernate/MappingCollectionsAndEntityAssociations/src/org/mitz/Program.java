package org.mitz;

import org.mitz.dao.BidDao;
import org.mitz.dao.ItemDao;
import org.mitz.model.Bid;
import org.mitz.model.Item;

public class Program {

	public static void main(String[] args) {
		ItemDao itemDao = new ItemDao();
		BidDao bidDao = new BidDao();
		Item item = new Item();
		item.setName("ITEM1");
		
		Bid bid1 = new Bid();
		bid1.setAmount(12);
		bid1.setItem(item);
		item.addBid(bid1);
		
		Bid bid2 = new Bid();
		bid2.setAmount(14);
		bid2.setItem(item);
		item.addBid(bid2);
		
		itemDao.create(item);
		bidDao.create(bid1);
		bidDao.create(bid2);
	}
}
