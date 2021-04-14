package cz.oksystem.autocomplete.core;

import cz.oksystem.autocomplete.api.AcoService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

@Controller
public class AcoController {

    private final AcoService acoService;

    public AcoController(AcoService acoService) {
        this.acoService = acoService;
    }

    /**
     * Záleží na počtu metod, mezi kterými se hledá odpovídající metoda pro zpracování http požadavku
     *
     * @param domain doména
     * @param input  zadaná slova
     * @return nalezené objekty dle zadaných slov pro zadanou doménu
     */
    @Get(value = "/{domain}/{input}")
    String getObjects(@PathVariable String domain, @PathVariable String input) {
        return acoService.getObjects(domain, input);
    }

}
