package academy.codillas.classwork.training1;

public class MultifunctionalMachine implements Scannable, Printable, Faxable {

    @Override
    public void scan(String document) {
        System.out.println("MFM Scan: " + document);
    }

    @Override
    public void print(String message) {
        System.out.println("MFM Print: " + message);
    }


    @Override
    public void send(String message) {
        System.out.println("MFM Fax: " + message);
    }

    @Override
    public void sendWithEmoji(String message, String emoji) {
        System.out.println("MFM Fax: " + message + emoji);
    }
}
