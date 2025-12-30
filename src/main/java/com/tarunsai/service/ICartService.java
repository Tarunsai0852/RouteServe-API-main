package com.tarunsai.service;

import com.tarunsai.entities.FoodCart;
import com.tarunsai.entities.Item;

public interface ICartService {

	public FoodCart addItemToCart(FoodCart cart, Item item);

	public FoodCart increaseQuantity(FoodCart cart, Item item, int quantity);

	public FoodCart reduceQuantity(FoodCart cart, Item item, int quantity);

	public FoodCart removeItem(FoodCart cart, Item item);

	public FoodCart clearCart(FoodCart cart);
}