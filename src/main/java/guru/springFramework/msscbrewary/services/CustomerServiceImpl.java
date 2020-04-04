package guru.springFramework.msscbrewary.services;

import guru.springFramework.msscbrewary.web.model.CustomerDto;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerByID(UUID customerID) {
        return CustomerDto.builder().id(UUID.randomUUID())
            .customerName("LeBron James")
            .build();
    }
}
