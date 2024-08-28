package com.senna.hexagonal.application.ports.in;

import com.senna.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);

}
