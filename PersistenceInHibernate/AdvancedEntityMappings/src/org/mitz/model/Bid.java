package org.mitz.model;

public class Bid {

	private Long id;
	private int amount;
	
	public Bid() {
	}

	public Long getId() {
		return id;
	}

	public Bid setId(Long id) {
		this.id = id;
		return this;
	}

	public int getAmount() {
		return amount;
	}

	public Bid setAmount(int amount) {
		this.amount = amount;
		return this;
	}

	@Override
	public String toString() {
		return "Bid [id=" + id + ", amount=" + amount + "]";
	}

	
}
