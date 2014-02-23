package de.jotb.playground.model.predicate;

import com.mysema.query.types.Predicate;
import de.jotb.playground.model.QCustomer;

/**
 * User: jotb
 * Date: 21.02.14
 * Time: 11:54
 */
public class CustomerPredicates {

    public static Predicate lastNameIsLike(final String lastName) {
        QCustomer customer = QCustomer.customer;
        return customer.lastName.startsWithIgnoreCase(lastName);
    }

    public static Predicate firstNameIsLike(final String firstName) {
        QCustomer customer = QCustomer.customer;
        return customer.firstName.startsWithIgnoreCase(firstName);

    }
}
