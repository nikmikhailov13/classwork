package gmail.nikmikhailov13.training1;

public class Printer implements Printable {

    @Override
    public void print(String message) {
        System.out.println("Printing: " + message);
    }
}
