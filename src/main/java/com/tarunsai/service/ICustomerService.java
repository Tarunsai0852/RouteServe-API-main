package com.tarunsai.service;

import java.util.List;

import com.tarunsai.entities.Customer;
import com.tarunsai.entities.Restaurant;

public interface ICustomerService {
	Customer addCustomer(Customer customer);

	Customer updateCustomer(Customer customer);

	Customer removeCustomer(Customer customer);

	Customer viewCustomer(Customer customer);

	List<Customer> viewAllCustomer(Restaurant rest);

}