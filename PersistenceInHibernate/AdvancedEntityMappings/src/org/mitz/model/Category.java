package org.mitz.model;

import java.util.HashSet;
import java.util.Set;


public class Category {

	private Long id;
	private String name;
	private Set<CategorizedItem> categorizedItems = new HashSet<CategorizedItem>();

	public Category() {}

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
	
	public Set<CategorizedItem> getCategorizedItems() {
		return categorizedItems;
	}

	public Category setCategorizedItems(Set<CategorizedItem> categorizedItems) {
		this.categorizedItems = categorizedItems;
		return this;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
	
	
}
