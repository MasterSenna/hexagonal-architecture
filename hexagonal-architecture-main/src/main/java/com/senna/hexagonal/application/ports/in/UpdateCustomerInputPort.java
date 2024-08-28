package com.senna.hexagonal.application.ports.in;

import com.senna.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);

}
