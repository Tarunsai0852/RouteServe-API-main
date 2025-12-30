package com.tarunsai.service;

import java.util.List;

import com.tarunsai.entities.Customer;
import com.tarunsai.entities.OrderDetails;
import com.tarunsai.entities.Restaurant;

public interface IOrderService {
	public OrderDetails addOrder(OrderDetails order);

	public OrderDetails updateOrder(OrderDetails order);

	public OrderDetails removeOrder(OrderDetails order);

	public OrderDetails viewOrder(OrderDetails order);

	public List<OrderDetails> viewAllOrders(Restaurant res);

	public List<OrderDetails> viewAllOrders(Customer customer);
}