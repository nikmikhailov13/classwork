package academy.codillas.classwork.lesson30;

public class WhatsApp implements Messenger {

    @Override
    public void send(String message) {
        System.out.println("Message was sent to WhatsApp: " + message);
    }

    @Override
    public String read(String message) {
        return "Message from WhatsApp: "+ message;
    }


}
