package org.mitz.model;

public class User {

	private Long id;
	private String name;
	private Address shippingAddress;

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
		return this;
	}

}
