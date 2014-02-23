package de.jotb.playground.controller;

import de.jotb.playground.model.Customer;
import de.jotb.playground.repository.CustomerRepository;
import de.jotb.playground.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * User: jotb
 * Date: 20.02.14
 * Time: 12:54
 */
@Controller
@RequestMapping("/")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /**
     * This handler method is invoked when
     * http://localhost:9090/playground is requested.
     * The method returns view name "index"
     * which will be resolved into /WEB-INF/views/index.jsp.
     *  See src/main/webapp/WEB-INF/spring/servlet-context.xml
     */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView listAllCustomers() {

        //todo: add some customers for displaying purposes

        List<Customer> customers = customerService.search("Roth");

        ModelAndView modelAndView = new ModelAndView("index");

        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
}
