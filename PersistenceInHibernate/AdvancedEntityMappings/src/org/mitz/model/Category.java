package org.mitz.model;

import java.util.HashSet;
import java.util.Set;

public class Category {

	private Long id;
	private String name;
	private Set<Item> items = new HashSet<Item>();

	public Category() {
	}

	public String getName() {
		return name;
	}

	public Long getId() {
		return id;
	}

	public Category setId(Long id) {
		this.id = id;
		return this;
	}

	public Category setName(String name) {
		this.name = name;
		return this;
	}

	public Set<Item> getItems() {
		return items;
	}

	public Category setItems(Set<Item> items) {
		this.items = items;
		return this;
	}

	public Category addItem(Item item) {
		items.add(item);
		return this;
	}
}
