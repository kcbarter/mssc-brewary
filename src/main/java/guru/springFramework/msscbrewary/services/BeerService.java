package guru.springFramework.msscbrewary.services;

import guru.springFramework.msscbrewary.web.model.BeerDto;
import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
