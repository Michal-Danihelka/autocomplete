package cz.oksystem.autocomplete.api;

/**
 * Našeptávač pro jednu konkrétní doménu
 */
public interface AcoDomainService {

    /**
     * @return název domény
     */
    String getName();

    /**
     * @param input zadaná slova
     * @return nalezené objekty pro zadaná slova
     */
    String getObjects(String input);
}
