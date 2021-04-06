package cz.oksystem.autocomplete.core;

public interface AutocompleteService<T extends AutocompleteDomain<T>> {
    AutocompleteResponse<T> getObjects(String input);
}
