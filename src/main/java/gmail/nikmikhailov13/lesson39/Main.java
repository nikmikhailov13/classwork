package gmail.nikmikhailov13.lesson39;

public class Main {
    public static void main(String[] args) {

        Playable playable = (name, size) -> {
            System.out.println("Name: " + name + " | Size: " + size);
        };

        playable.play("CoD", 10);

        String a = Playable.MAX_STRING;

        Computer computer = new Computer();

        Computer computer1 = new Computer(1,  "123");

        computer.playGame(playable, "Warcraft", 20);
    }
}
