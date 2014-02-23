package de.jotb.playground.repository;

import de.jotb.playground.model.Account;
import de.jotb.playground.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import java.util.List;

/**
 * User: jotb
 * Date: 20.02.14
 * Time: 14:14
 */
public interface AccountRepository extends JpaRepository<Account, Long>, QueryDslPredicateExecutor<Account> {

    List<Account> findByCustomer(Customer customer);
}
