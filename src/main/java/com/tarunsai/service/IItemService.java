package com.tarunsai.service;

import java.util.List;

import com.tarunsai.entities.Category;
import com.tarunsai.entities.Item;
import com.tarunsai.entities.Restaurant;

public interface IItemService {
	public Item addItem(Item item);

	public Item updateItem(Item item);

	public Item viewItem(Item item);

	public Item viewItem(String itemId);

	public Item removeItem(Item item);

	public List<Item> viewAllItems(Category cat);

	public List<Item> viewAllItems(Restaurant res);

	public List<Item> viewAllItemsByName(String name);
}