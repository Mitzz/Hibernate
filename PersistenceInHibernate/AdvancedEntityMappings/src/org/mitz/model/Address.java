package org.mitz.model;

public class Address {

	private Long id;
	private String street;
	private String city;
	private int zipCode;
	
	public Address() {
	}

	public Long getId() {
		return id;
	}

	public Address setId(Long id) {
		this.id = id;
		return this;
	}

	public String getStreet() {
		return street;
	}

	public Address setStreet(String street) {
		this.street = street;
		return this;
	}

	public String getCity() {
		return city;
	}

	public Address setCity(String city) {
		this.city = city;
		return this;
	}

	public int getZipCode() {
		return zipCode;
	}

	public Address setZipCode(int zipCode) {
		this.zipCode = zipCode;
		return this;
	}

	
	
}
