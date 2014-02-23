package de.jotb.playground.repository;

import de.jotb.playground.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: jotb
 * Date: 20.02.14
 * Time: 12:51
 */
@Transactional()
public interface CustomerRepository extends JpaRepository<Customer, Long>, QueryDslPredicateExecutor<Customer> {

    Page<Customer> findByLastName(String lastname, Pageable pageable);
}
