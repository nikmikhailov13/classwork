package gmail.nikmikhailov13.lesson40.inheritance;

public class Printer implements Printable {

    @Override
    public void print(String message) {
        System.out.println("Printing: " + message);
    }
}
