package cz.oksystem.autocomplete.util;

import org.junit.jupiter.api.Test;

import static cz.oksystem.autocomplete.util.ArrayUtils.join;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayUtilsTest {

    @Test
    void testJoin() {
        // int array + int
        assertArrayEquals(join(new int[]{1}, 2), new int[]{1, 2});
        assertArrayEquals(join(new int[]{1, 2, 3}, 4), new int[]{1, 2, 3, 4});
        assertArrayEquals(join(null, 2), new int[]{2});
        assertArrayEquals(join(new int[]{}, 2), new int[]{2});

        // int array + int array
        assertArrayEquals(join(new int[]{1}, new int[]{2}), new int[]{1, 2});
        assertArrayEquals(join(new int[]{1, 2, 3}, new int[]{4, 5}), new int[]{1, 2, 3, 4, 5});
        assertArrayEquals(join(null, new int[]{4, 5}), new int[]{4, 5});
        assertArrayEquals(join(new int[]{1, 2, 3}, null), new int[]{1, 2, 3});
        assertArrayEquals(join(null, null), new int[]{});

        // int array + int array + int array
        assertArrayEquals(join(new int[]{1}, new int[]{2}, new int[]{3}), new int[]{1, 2, 3});
        assertArrayEquals(join(new int[]{1, 2, 3}, new int[]{4, 5}, new int[]{6}), new int[]{1, 2, 3, 4, 5, 6});
        assertArrayEquals(join(null, new int[]{4, 5}, new int[]{6}), new int[]{4, 5, 6});
        assertArrayEquals(join(new int[]{1, 2, 3}, null, null), new int[]{1, 2, 3});
        assertArrayEquals(join(new int[]{1, 2, 3}, null, new int[]{4, 5}), new int[]{1, 2, 3, 4, 5});
        assertArrayEquals(join(null, null, null), new int[]{});

        // array of int array
        assertArrayEquals(join(new int[]{1}, new int[]{2}, new int[]{3}, new int[]{4}), new int[]{1, 2, 3, 4});
        assertArrayEquals(join(new int[]{1, 2, 3}, new int[]{4, 5}, new int[]{6}, null, null), new int[]{1, 2, 3, 4, 5, 6});
        assertArrayEquals(join(null, new int[]{4, 5}, new int[]{6}, null, null), new int[]{4, 5, 6});
        assertArrayEquals(join(null, new int[]{1, 2, 3}, null, null), new int[]{1, 2, 3});
        assertArrayEquals(join(null, null, null, null, null, null, new int[]{1, 2, 3}, null, new int[]{4, 5}), new int[]{1, 2, 3, 4, 5});
        assertArrayEquals(join(null, null, null, null, null, null, null), new int[]{});
        assertArrayEquals(join(new int[][]{{1, 2}, {3, 4}, {5, 6}}), new int[]{1, 2, 3, 4, 5, 6});
    }
}