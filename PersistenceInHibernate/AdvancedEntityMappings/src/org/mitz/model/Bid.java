package org.mitz.model;

public class Bid {

	private Long id;
	private int amount;
	private Item item;
	
	public Bid() {
	}

	public Long getId() {
		return id;
	}

	public Bid setId(Long id) {
		this.id = id;
		return this;
	}

	public Item getItem() {
		return item;
	}

	public Bid setItem(Item item) {
		this.item = item;
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
