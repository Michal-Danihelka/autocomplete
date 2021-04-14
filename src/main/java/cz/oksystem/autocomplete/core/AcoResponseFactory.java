package cz.oksystem.autocomplete.core;

import lombok.Data;

import javax.inject.Singleton;

// vytváří odpovědi
@Data
@Singleton
public class AcoResponseFactory {
    private final String[] attributeNames;

    // vytvoří odpověd na základě nalezených indexů objektů
    // null znamená, že zadaným parametrům odpovídá více než Configuration.RESPONSE_OBJECT_COUNT_LIMIT objektů
    // prázný list znamená, že žádný objekt nebyl nalezen
    public String ok(int[] objectIndexes) {
        return "ok";
    }

    public String error(int code, String message) {
        return "error";
    }
}
