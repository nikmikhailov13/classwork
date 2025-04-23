package academy.codillas.classwork.lesson39;

public class Computer {

    public Computer() {
        System.out.println("This is LEGO");
    }

    public Computer(int a, String b) {
        System.out.println("A -> " + a + " B -> " + b);
    }

    public void playGame(Playable playable, String gameName, int gameSize) {
        playable.play(gameName, gameSize);
    }

    public int playGame(Playable playable, String gameName, double gameSize) {
        playable.play(gameName, (int) gameSize);
        return 0;
    }
}
