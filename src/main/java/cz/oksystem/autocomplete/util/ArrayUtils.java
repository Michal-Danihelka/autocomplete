package cz.oksystem.autocomplete.util;

// Pomocné metody pro práci s poli, převážně pro vytváření int[] spojováním vstupních parametrů
public final class ArrayUtils {

    public static final int[] EMPTY_INT_ARRAY = new int[]{};

    public static int[] join(int[] array1, int item) {
        if (array1 == null) {
            array1 = EMPTY_INT_ARRAY;
        }
        int[] rv = new int[array1.length + 1];
        System.arraycopy(array1, 0, rv, 0, array1.length);
        rv[array1.length] = item;
        return rv;
    }

    public static int[] join(int[] array1, int[] array2) {
        if (array1 == null) {
            array1 = EMPTY_INT_ARRAY;
        }
        if (array2 == null) {
            array2 = EMPTY_INT_ARRAY;
        }
        int[] rv = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, rv, 0, array1.length);
        System.arraycopy(array2, 0, rv, array1.length, array2.length);
        return rv;
    }

    public static int[] join(int[] array1, int[] array2, int[] array3) {
        if (array1 == null) {
            array1 = EMPTY_INT_ARRAY;
        }
        if (array2 == null) {
            array2 = EMPTY_INT_ARRAY;
        }
        if (array3 == null) {
            array3 = EMPTY_INT_ARRAY;
        }
        int[] rv = new int[array1.length + array2.length + array3.length];
        System.arraycopy(array1, 0, rv, 0, array1.length);
        System.arraycopy(array2, 0, rv, array1.length, array2.length);
        System.arraycopy(array3, 0, rv, array1.length + array2.length, array3.length);
        return rv;
    }

    public static int[] join(int[]... arrays) {
        if (arrays == null) {
            return EMPTY_INT_ARRAY;
        }
        int length = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == null) {
                arrays[i] = EMPTY_INT_ARRAY;
            }
            length += arrays[i].length;
        }
        int[] rv = new int[length];
        int filled = 0;
        for (int[] array : arrays) {
            System.arraycopy(array, 0, rv, filled, array.length);
            filled += array.length;
        }
        return rv;
    }

}
