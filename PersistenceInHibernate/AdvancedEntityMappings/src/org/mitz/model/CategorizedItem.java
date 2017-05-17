package org.mitz.model;

import java.io.Serializable;
import java.util.Date;

public class CategorizedItem {

	public static class Id implements Serializable{
		private Long categoryId;
		private Long itemId;
		
		public Id(){}

		public Id(Long categoryId, Long itemId) {
			this.categoryId = categoryId;
			this.itemId = itemId;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((categoryId == null) ? 0 : categoryId.hashCode());
			result = prime * result
					+ ((itemId == null) ? 0 : itemId.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Id other = (Id) obj;
			if (categoryId == null) {
				if (other.categoryId != null)
					return false;
			} else if (!categoryId.equals(other.categoryId))
				return false;
			if (itemId == null) {
				if (other.itemId != null)
					return false;
			} else if (!itemId.equals(other.itemId))
				return false;
			return true;
		}
		
		
	}
	
	private Id id = new Id();
	private String username;
	private Date dateAdded = new Date();
	private Item item;
	private Category category;
	
	public CategorizedItem(){}

	public CategorizedItem(String username, Item item, Category category) {
		this.username = username;
		this.item = item;
		this.category = category;
		
		this.id.categoryId = category.getId();
		this.id.itemId = item.getId();
		
		category.getCategorizedItems().add(this);
		item.getCategorizedItems().add(this);
	}

	public String getUsername() {
		return username;
	}

	public CategorizedItem setUsername(String username) {
		this.username = username;
		return this;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public CategorizedItem setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
		return this;
	}

	public Item getItem() {
		return item;
	}

	public CategorizedItem setItem(Item item) {
		this.item = item;
		return this;
	}

	public Category getCategory() {
		return category;
	}

	public CategorizedItem setCategory(Category category) {
		this.category = category;
		return this;
	}

	public Id getId() {
		return id;
	}

	public CategorizedItem setId(Id id) {
		this.id = id;
		return this;
	}
	
	
}
