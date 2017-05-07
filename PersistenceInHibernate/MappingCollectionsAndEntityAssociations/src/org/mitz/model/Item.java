package org.mitz.model;

import java.util.HashSet;
import java.util.Set;

public class Item {

	private long id;
	private String name;
	private Set<Bid> bids = new HashSet<Bid>();
	
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

	public Set<Bid> getBids() {
		return bids;
	}

	public Item setBids(Set<Bid> bids) {
		this.bids = bids;
		return this;
	}
	
	public Item addBid(Bid bid){
		bids.add(bid);
		bid.setItem(this);
		return this;
	}
}
