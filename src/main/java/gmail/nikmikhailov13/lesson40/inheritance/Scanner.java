package gmail.nikmikhailov13.lesson40.inheritance;

public class Scanner implements Scannable {
    @Override
    public void scan(String document) {
        System.out.println("Scan: " + document);
    }
}
