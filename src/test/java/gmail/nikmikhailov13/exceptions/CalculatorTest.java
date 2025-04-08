package gmail.nikmikhailov13.exceptions;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@Disabled
class CalculatorTest {

    @Test
    void shouldDoDivision() throws DivisionByZeroException {
        // given
        int a = 5;
        int b = 2;

        // when
        int result = Calculator.divide(a, b);

        // then
        assertEquals(2, result);
    }

    @Test
    void shouldThrowExceptionWhenDivisionByZero() {
        // given
        int a = 5;
        int b = 0;

        // when & then
        assertThrows(DivisionByZeroException.class, () -> Calculator.divide(a, b));
    }

}