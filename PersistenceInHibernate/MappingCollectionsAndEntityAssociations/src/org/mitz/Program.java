package org.mitz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.mitz.dao.ItemDao;
import org.mitz.model.Item;

public class Program {

	public static List<Item> items = new ArrayList<Item>();

	static {
		Set<String> images = new HashSet<String>();
		Collection<String> imageBag = new ArrayList<String>();
		List<String> imageList = new ArrayList<String>();
		Map<String, String> imageMap = new HashMap<String, String>();
		
		Item item = new Item();
		item.setName("ITEM1");
		images.add("IMG1");
		images.add("IMG2");
		images.add("IMG3");
		imageBag.add("IMG_BAG_1");
		imageBag.add("IMG_BAG_2");
		imageBag.add("IMG_BAG_3");
		imageList.add("IMG_LIST_1");
		imageList.add("IMG_LIST_2");
		imageList.add("IMG_LIST_3");
		imageMap.put("IMG_KEY_1", "IMG_VALUE_1");
		imageMap.put("IMG_KEY_2", "IMG_VALUE_2");
		imageMap.put("IMG_KEY_3", "IMG_VALUE_3");
		item.setImages(images)
			.setImageBag(imageBag)
			.setImageList(imageList)
			.setImageMap(imageMap);
		items.add(item);

		item = new Item();
		images = new HashSet<String>();
		imageBag = new ArrayList<String>();
		imageList = new ArrayList<String>();
		imageMap = new HashMap<String, String>();
		item.setName("ITEM2");
		images.add("IMG4");
		images.add("IMG5");
		images.add("IMG6");
		imageBag.add("IMG_BAG_4");
		imageBag.add("IMG_BAG_5");
		imageBag.add("IMG_BAG_6");
		imageList.add("IMG_LIST_4");
		imageList.add("IMG_LIST_5");
		imageList.add("IMG_LIST_6");
		imageMap.put("IMG_KEY_4", "IMG_VALUE_4");
		imageMap.put("IMG_KEY_5", "IMG_VALUE_5");
		imageMap.put("IMG_KEY_6", "IMG_VALUE_6");
		item.setImages(images)
			.setImageBag(imageBag)
			.setImageList(imageList)
			.setImageMap(imageMap);
		items.add(item);

		item = new Item();
		images = new HashSet<String>();
		imageBag = new ArrayList<String>();
		imageList = new ArrayList<String>();
		imageMap = new HashMap<String, String>();
		item.setName("ITEM3");
		images.add("IMG7");
		images.add("IMG8");
		images.add("IMG9");
		imageBag.add("IMG_BAG_7");
		imageBag.add("IMG_BAG_8");
		imageBag.add("IMG_BAG_9");
		imageList.add("IMG_LIST_7");
		imageList.add("IMG_LIST_8");
		imageList.add("IMG_LIST_9");
		imageMap.put("IMG_KEY_7", "IMG_VALUE_7");
		imageMap.put("IMG_KEY_8", "IMG_VALUE_8");
		imageMap.put("IMG_KEY_9", "IMG_VALUE_9");
		item.setImages(images)
			.setImageBag(imageBag)
			.setImageList(imageList)
			.setImageMap(imageMap);
		items.add(item);

	}

	public static void main(String[] args) {
		ItemDao dao = new ItemDao();
		
		for(Item item: items)
			dao.create(item);
		
	}
}
