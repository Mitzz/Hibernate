package org.mitz.model;

public class Image {

	private String name;
	private String filename;
	private int sizeX;
	private int sizeY;
	private Item item;

	public Image() {
	}

	public String getName() {
		return name;
	}

	public Image setName(String name) {
		this.name = name;
		return this;
	}

	public String getFilename() {
		return filename;
	}

	public Image setFilename(String filename) {
		this.filename = filename;
		return this;
	}

	public int getSizeX() {
		return sizeX;
	}

	public Image setSizeX(int sizeX) {
		this.sizeX = sizeX;
		return this;
	}

	public int getSizeY() {
		return sizeY;
	}

	public Image setSizeY(int sizeY) {
		this.sizeY = sizeY;
		return this;
	}

	public Item getItem() {
		return item;
	}

	public Image setItem(Item item) {
		this.item = item;
		return this;
	}

	
}
