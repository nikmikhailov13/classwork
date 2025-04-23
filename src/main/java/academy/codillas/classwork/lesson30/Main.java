package academy.codillas.classwork.lesson30;

public class Main {

    public static void main(String[] args) {
        Viber viber = new Viber();
        WhatsApp whatsApp = new WhatsApp();

        viber.showAd();
        viber.send("Hello World");
        viber.showDefaultAd();

        String receivedMessage = viber.read("З Пасхою! 🐣");
        System.out.println(receivedMessage);

        System.out.println(Ad.DEFAULT_AD);
        Ad.distributeFlyers();
    }
}
