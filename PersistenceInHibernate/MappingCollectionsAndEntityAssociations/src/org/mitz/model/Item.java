package org.mitz.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Item {

	private long id;
	private String name;
	private Set<String> images = new HashSet<String>();
	private Collection<String> imageBag = new ArrayList<String>();
	private List<String> imageList = new ArrayList<String>();
	private Map<String, String> imageMap = new HashMap<String, String>();

	public long getId() {
		return id;
	}

	public Item setId(long id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Item setName(String name) {
		this.name = name;
		return this;
	}

	public Set<String> getImages() {
		return images;
	}

	public Item setImages(Set<String> images) {
		this.images = images;
		return this;
	}

	public Collection<String> getImageBag() {
		return imageBag;
	}

	public Item setImageBag(Collection<String> imageBag) {
		this.imageBag = imageBag;
		return this;
	}

	public List<String> getImageList() {
		return imageList;
	}

	public Item setImageList(List<String> imageList) {
		this.imageList = imageList;return this;
	}

	public Map<String, String> getImageMap() {
		return imageMap;
	}

	public Item setImageMap(Map<String, String> imageMap) {
		this.imageMap = imageMap;
		return this;
	}

	
}
