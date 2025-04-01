package gmail.nikmikhailov13.lesson30_interfaces;

public interface Ad {

    String DEFAULT_AD = "Купуємо акумулятори!";

    void showAd();

    default void showDefaultAd(){
        System.out.println(DEFAULT_AD);
    }

    static void distributeFlyers(){
        System.out.println("Розклали листівочки!");
    }
}
