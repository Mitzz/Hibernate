package org.mitz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.mitz.dao.ItemDao;
import org.mitz.model.Item;

public class Program {

	public static List<Item> items = new ArrayList<Item>();

	static {
		Set<String> images = new HashSet<String>();

		Item item = new Item();
		item.setName("ITEM1");
		images.add("IMG1");
		images.add("IMG2");
		images.add("IMG3");
		item.setImages(images);
		items.add(item);

		item = new Item();
		images = new HashSet<String>();
		item.setName("ITEM2");
		images.add("IMG4");
		images.add("IMG5");
		images.add("IMG6");
		item.setImages(images);
		items.add(item);

		item = new Item();
		images = new HashSet<String>();
		item.setName("ITEM3");
		images.add("IMG7");
		images.add("IMG8");
		images.add("IMG9");
		item.setImages(images);
		items.add(item);
	}

	public static void main(String[] args) {
		ItemDao dao = new ItemDao();
		
		for(Item item: items)
			dao.create(item);
		
	}
}
