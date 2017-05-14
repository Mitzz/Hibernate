package org.mitz.model;

import java.util.HashSet;
import java.util.Set;

public class User {

	private Long id;
	private String name;
	private Address shippingAddress;
	private Set<Item> boughtItems = new HashSet<Item>();

	public User() {
		super();
	}

	public Long getId() {
		return id;
	}

	public User setId(Long id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public User setName(String name) {
		this.name = name;
		return this;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public User setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
		shippingAddress.setUser(this);
		return this;
	}

	public Set<Item> getBoughtItems() {
		return boughtItems;
	}

	public User setBoughtItems(Set<Item> boughtItems) {
		this.boughtItems = boughtItems;
		return this;
	}

	public User addBoughtItems(Item boughtItem) {
		this.boughtItems.add(boughtItem);
		boughtItem.setBuyer(this);
		return this;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
}
