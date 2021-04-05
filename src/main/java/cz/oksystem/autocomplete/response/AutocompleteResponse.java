package cz.oksystem.autocomplete.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;
import java.util.function.Function;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutocompleteResponse<T extends Function<String[], T>> {
    private final int code;
    private final String message;
    private final List<T> objects;
}
