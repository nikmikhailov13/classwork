package gmail.nikmikhailov13.lesson29.animals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo(1);
        Fox fox1 = new Fox(10, 3, "Firfirfir", false);
        Fox fox2 = new Fox(3, 4, "Fyrfyrfyr", false);
        Fox fox3 = new Fox(3, 4, "Kiskiskis", false);

        zoo.add(fox1);
        zoo.add(fox2);
        zoo.add(fox3);

        System.out.println(zoo);

        Optional<Fox> optionalFox = zoo.searchFoxByName("Kiskiskis");

        if (optionalFox.isPresent()) {
            Fox fox = optionalFox.get();
            System.out.println(fox);
        } else {
            System.out.println("No Fox found");
        }

    }

}
