package academy.codillas.classwork.training1;

public class Printer implements Printable {

    @Override
    public void print(String message) {
        System.out.println("Printing: " + message);
    }
}
