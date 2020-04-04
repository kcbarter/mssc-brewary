package guru.springFramework.msscbrewary.services;

import guru.springFramework.msscbrewary.web.model.CustomerDto;
import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerByID(UUID customerID);
}
