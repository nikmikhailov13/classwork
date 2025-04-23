package academy.codillas.classwork.lesson30;

public class Viber implements Messenger, Ad {
    @Override
    public void send(String message) {
        System.out.println("Message was sent to Viber: " + message);
    }

    @Override
    public String read(String message) {
        return "Message from Viber: " + message;
    }

    @Override
    public void showAd() {
        System.out.println("З першим квітня! Ха-Ха! Спина біла у тебе!");
    }
}
