package gmail.nikmikhailov13.training1;

public class Scanner implements Scannable {
    @Override
    public void scan(String document) {
        System.out.println("Scan: " + document);
    }
}
