package guru.springFramework.msscbrewary.services;

import guru.springFramework.msscbrewary.web.model.CustomerDto;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerByID(UUID customerID) {
        return CustomerDto.builder().id(UUID.randomUUID())
            .customerName("LeBron James")
            .build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        return customerDto.builder()
            .id(UUID.randomUUID())
            .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //todo impl - add a real impl to update customer
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.debug("Deleting customer.....");
    }
}
