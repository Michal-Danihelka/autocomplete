package cz.oksystem.autocomplete.address;

import com.fasterxml.jackson.annotation.JsonInclude;
import cz.oksystem.autocomplete.core.AutocompleteDomain;
import lombok.Data;

import static java.lang.Integer.parseInt;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address implements AutocompleteDomain<Address> {
    private final int kod;
    private final String obec;
    private final String MOMC;
    private final String obvodPrahy;
    private final String castObce;
    private final String ulice;
    private final int cisloDomovni;
    private final String cisloOrientacni;
    private final int PSC;

    @Override
    public Address createObject(String[] objectProperties) {
        return new Address(parseInt(objectProperties[0]), objectProperties[1], objectProperties[2], objectProperties[3],
                objectProperties[4], objectProperties[5], parseInt(objectProperties[6]), objectProperties[7],
                parseInt(objectProperties[8]));
    }
}
