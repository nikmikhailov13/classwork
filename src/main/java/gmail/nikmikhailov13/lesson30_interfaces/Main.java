package gmail.nikmikhailov13.lesson30_interfaces;

public class Main {

    public static void main(String[] args) {
        Viber viber = new Viber();
        WhatsApp whatsApp = new WhatsApp();

        viber.showAd();
        viber.send("Hello World");
        String receivedMessage = viber.read("З Пасхою! 🐣");
        viber.showDefaultAd();

        System.out.println(receivedMessage);

        System.out.println(Ad.DEFAULT_AD);
        Ad.distributeFlyers();
    }
}
