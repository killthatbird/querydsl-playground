package de.jotb.playground.service;

import de.jotb.playground.model.Customer;
import de.jotb.playground.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

import static de.jotb.playground.model.predicate.CustomerPredicates.lastNameIsLike;

/**
 * User: jotb
 * Date: 21.02.14
 * Time: 11:59
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> search(String searchTerm) {
        Iterable<Customer> customers = customerRepository.findAll(lastNameIsLike(searchTerm));
        return constructList(customers);
    }

    private List<Customer> constructList(Iterable<Customer> customers) {
        List<Customer> list = new ArrayList<Customer>();
        for (Customer customer: customers) {
            list.add(customer);
        }
        return list;
    }
}
