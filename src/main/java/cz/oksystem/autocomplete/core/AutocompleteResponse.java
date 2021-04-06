package cz.oksystem.autocomplete.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutocompleteResponse<T extends AutocompleteDomain<T>> {
    private final int code;
    private final String message;
    private final List<T> objects;
}
