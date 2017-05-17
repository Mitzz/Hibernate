package org.mitz.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Item {

	private long id;
	private String name;
	private List<Bid> bids = new ArrayList<Bid>();
	private User buyer;
	private Set<CategorizedItem> categorizedItems = new HashSet<CategorizedItem>();
	
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

	public List<Bid> getBids() {
		return bids;
	}

	public Item setBids(List<Bid> bids) {
		this.bids = bids;
		return this;
	}
	
	public Item addBid(Bid bid){
		bids.add(bid);
		bid.setItem(this);
		return this;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", bids=" + bids + "]";
	}

	public User getBuyer() {
		return buyer;
	}

	public Item setBuyer(User buyer) {
		this.buyer = buyer;
		return this;
	}

	public Set<CategorizedItem> getCategorizedItems() {
		return categorizedItems;
	}

	public Item setCategorizedItems(Set<CategorizedItem> categorizedItems) {
		this.categorizedItems = categorizedItems;
		return this;
	}

}
