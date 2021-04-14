package cz.oksystem.autocomplete.api;

/**
 * Našeptávač s povinným parametrem domény
 */
public interface AcoService {
    /**
     * @param domain doména
     * @param input  zadaná slova
     * @return nalezené objekty dle zadaných slov pro zadanou doménu
     */
    String getObjects(String domain, String input);

}
