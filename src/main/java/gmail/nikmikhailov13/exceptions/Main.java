package gmail.nikmikhailov13.exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            Calculator.divide(5, 0);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Message from finally block");
        }

        System.out.println("Hello World!");
    }
}
