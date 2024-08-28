package com.senna.hexagonal.application.ports.in;

import com.senna.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);

}
