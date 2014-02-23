package de.jotb.playground.service;

import de.jotb.playground.model.Customer;

import java.util.List;

/**
 * User: jotb
 * Date: 21.02.14
 * Time: 11:58
 */
public interface CustomerService {

    public List<Customer> search(String searchTerm);
}
