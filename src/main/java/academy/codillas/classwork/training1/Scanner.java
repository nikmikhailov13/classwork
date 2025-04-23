package academy.codillas.classwork.training1;

public class Scanner implements Scannable {
    @Override
    public void scan(String document) {
        System.out.println("Scan: " + document);
    }
}
