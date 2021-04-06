package cz.oksystem.autocomplete.address;

import cz.oksystem.autocomplete.core.AutocompleteResponse;
import cz.oksystem.autocomplete.core.AutocompleteService;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class AddressAutocompleteService implements AutocompleteService<Address> {
    @Override
    public AutocompleteResponse<Address> getObjects(String input) {
        List<Address> addresses = new ArrayList<>();
        addresses.add(new Address(4192699, "Želechovice nad Dřevnicí", null, null,
                "Želechovice nad Dřevnicí", "Osvobození", 16, null, 76311));
        addresses.add(new Address(4192702, "Želechovice nad Dřevnicí", null, null,
                "Želechovice nad Dřevnicí", "Přílucká", 17, null, 76311));
        return new AutocompleteResponse<>(0, null, addresses);
    }
}
