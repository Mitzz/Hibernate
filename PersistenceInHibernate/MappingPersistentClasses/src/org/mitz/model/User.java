package org.mitz.model;

public class User {

	private Long id;
	private String firstName;
	private String lastName;

	private Address homeAddress;
	private Address billingAddress;

	public User() {
		super();
	}

	public User(String firstName, String lastName,
			Address homeAddress, Address billingAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.homeAddress = homeAddress;
		this.billingAddress = billingAddress;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + "]";
	}

	
}