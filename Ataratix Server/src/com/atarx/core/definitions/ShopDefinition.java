package com.atarx.core.definitions;

import com.atarx.rs2.entity.item.Item;

public class ShopDefinition {

	private short id;
	private String name;
	private boolean general;
	private Item[] items;

	public int getId() {
		return id;
	}

	public Item[] getItems() {
		return items;
	}

	public String getName() {
		return name;
	}

	public boolean isGeneral() {
		return general;
	}
}
