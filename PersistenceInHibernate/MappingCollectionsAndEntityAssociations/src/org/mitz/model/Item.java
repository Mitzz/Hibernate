package org.mitz.model;

import java.util.LinkedHashSet;
import java.util.Set;

public class Item {

	private long id;
	private String name;
	private Set<String> images = new LinkedHashSet<String>();
	
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

	public void setImages(Set<String> images) {
		this.images = images;
	}

	
}
