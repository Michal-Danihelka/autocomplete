package cz.oksystem.autocomplete.address;

import cz.oksystem.autocomplete.core.AutocompleteResponse;
import cz.oksystem.autocomplete.core.AutocompleteService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

import javax.inject.Named;

@Controller
public class AddressController {

    private final AutocompleteService<Address> service;

    AddressController(@Named("address") AutocompleteService<Address> service) {
        this.service = service;
    }

    @Get(value = "/address/{input}")
    AutocompleteResponse<Address> getAddresses(@PathVariable String input) {
        return service.getObjects(input);
    }

}
