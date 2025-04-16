package gmail.nikmikhailov13.lesson40.inheritance;

public class Fax implements Faxable {

    @Override
    public void send(String message) {
        System.out.println("Fax: " + message);
    }

    @Override
    public void sendWithEmoji(String message, String emoji) {
        System.out.println("Fax: " + message + emoji);
    }
}
