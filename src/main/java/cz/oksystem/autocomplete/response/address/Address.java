package cz.oksystem.autocomplete.response.address;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.function.Function;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address implements Function<String[], Address> {
    private final String kod;
    private final String obec;
    private final String MOMC;
    private final String obvodPrahy;
    private final String castObce;
    private final String ulice;
    private final String cisloDomovni;
    private final String cisloOrientacni;
    private final String PSC;

    @Override
    public Address apply(String[] objectProperties) {
        return new Address(objectProperties[0], objectProperties[1], objectProperties[2], objectProperties[3],
                objectProperties[4], objectProperties[5], objectProperties[6], objectProperties[7], objectProperties[8]);
    }
}
