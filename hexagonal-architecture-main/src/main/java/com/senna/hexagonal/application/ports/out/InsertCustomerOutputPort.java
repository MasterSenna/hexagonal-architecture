package com.senna.hexagonal.application.ports.out;

import com.senna.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);

}
