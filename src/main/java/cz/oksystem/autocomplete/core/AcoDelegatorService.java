package cz.oksystem.autocomplete.core;

import cz.oksystem.autocomplete.api.AcoDomainService;
import cz.oksystem.autocomplete.api.AcoService;
import io.micronaut.context.annotation.Property;

import javax.inject.Singleton;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

@Singleton
public class AcoDelegatorService implements AcoService {

    Map<String, AcoDomainService> acoDomainServices = new HashMap<>();

    public AcoDelegatorService(@Property(name = "dataPath") Path dataPath) {

    }

    @Override
    public String getObjects(String domain, String input) {
        return acoDomainServices.get(domain).getObjects(input);
    }

}
