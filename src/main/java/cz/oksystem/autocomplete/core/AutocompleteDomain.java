package cz.oksystem.autocomplete.core;

public interface AutocompleteDomain<T> {
    T createObject(String[] objectProperties);
}
