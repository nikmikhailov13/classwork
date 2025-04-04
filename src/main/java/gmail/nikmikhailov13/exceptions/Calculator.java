package gmail.nikmikhailov13.exceptions;

public class Calculator {

    public static int divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return a / b;
    }
}
