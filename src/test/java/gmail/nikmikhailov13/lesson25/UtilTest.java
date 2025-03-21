package gmail.nikmikhailov13.lesson25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class UtilTest {

    @Test
    void shouldReverseAnArray() {
        // given
        int[] array = {1, 2, 3, 4, 5};

        // when
        int[] reversedArray = Util.reverse(array);

        // then
        int[] expectedArray = {5, 4, 3, 2, 1};
        assertArrayEquals(expectedArray, reversedArray);
    }

    @Test
    void shouldReverseAnArrayWith10Elements() {
        // given
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // when
        int[] reversedArray = Util.reverse(array);

        // then
        int[] expectedArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertArrayEquals(expectedArray, reversedArray);
    }

    @Test
    void shouldReverseAnEmptyArray() {
        // given
        int[] array = {};

        // when
        int[] reversedArray = Util.reverse(array);

        // then
        int[] expectedArray = {};
        assertArrayEquals(expectedArray, reversedArray);
    }
}