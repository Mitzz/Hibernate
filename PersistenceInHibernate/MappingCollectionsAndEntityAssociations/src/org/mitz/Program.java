package org.mitz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.mitz.dao.ItemDao;
import org.mitz.model.Image;
import org.mitz.model.Item;

public class Program {

	public static List<Item> items = new ArrayList<Item>();

	static {
		Set<Image> images = new HashSet<Image>();
		
		Item item = new Item();
		item.setName("ITEM1");
		Image img = new Image();
		img.setName("IMG1");
		img.setFilename("FILE1");
		img.setSizeX(1);
		img.setSizeY(2);
		images.add(img);
		
		img = new Image();
		img.setName("IMG2");
		img.setFilename("FILE2");
		img.setSizeX(3);
		img.setSizeY(4);
		images.add(img);
		
		img = new Image();
		img.setName("IMG3");
		img.setFilename("FILE3");
		img.setSizeX(3);
		img.setSizeY(4);
		images.add(img);
		
		item.setImages(images);
		items.add(item);

	}

	public static void main(String[] args) {
		ItemDao dao = new ItemDao();
		
		for(Item item: items)
			dao.create(item);
		
		Item item = dao.retrieve(1L);
		System.out.println(item);
		Set<Image> images = item.getImages();
		for(Image image: images)
			System.out.println(image.getItem());
	}
}
