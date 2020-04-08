package guru.springFramework.msscbrewary.services;

import guru.springFramework.msscbrewary.web.model.CustomerDto;
import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerByID(UUID customerID);

    CustomerDto saveCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteCustomer(UUID customerId);
}
