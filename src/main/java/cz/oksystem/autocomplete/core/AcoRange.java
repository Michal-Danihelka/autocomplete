package cz.oksystem.autocomplete.core;

import javax.validation.constraints.NotNull;

public class AcoRange {

    private final int min;
    private final int max;

    public AcoRange(@NotNull String range) {
        range = range.replaceAll("\\s", "");
        try {
            String[] numbers = range.split("-");
            this.min = Integer.parseInt(numbers[0]);
            this.max = Integer.parseInt(numbers[(numbers.length > 1 ? 1 : 0)]);
        } catch (NumberFormatException exception) {
            throw new NumberFormatException("Rozsah " + range + " nereprezentuje interval. Správný formát je například 16-21 nebo 25.");
        }
    }

    public AcoRange(int border) {
        this(border, border);
    }

    public AcoRange(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    boolean isInRange(int number) {
        return this.min <= number && number <= this.max;
    }

    public String toString() {
        return this.min != this.max ? this.min + "-" + this.max : "" + this.min;
    }

}
