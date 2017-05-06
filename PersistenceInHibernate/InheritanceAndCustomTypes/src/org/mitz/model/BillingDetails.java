package org.mitz.model;

public class BillingDetails {

	private Long id;
	private String owner;

	public BillingDetails() {
		super();
	}
	
	public BillingDetails(Long id, String owner) {
		super();
		this.id = id;
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "BillingDetails [id=" + id + ", owner=" + owner + "]";
	}

	public BillingDetails(String owner) {
		// TODO Auto-generated constructor stub
		this.owner = owner;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}