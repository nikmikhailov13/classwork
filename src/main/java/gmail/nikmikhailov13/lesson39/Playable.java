package gmail.nikmikhailov13.lesson39;

public interface Playable {
    String MAX_STRING = "123";
    void play(String gameName, int gameSize);

    default void test() {
        System.out.println();
    }
}
