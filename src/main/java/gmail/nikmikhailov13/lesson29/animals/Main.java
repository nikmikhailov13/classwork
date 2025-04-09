package gmail.nikmikhailov13.lesson29.animals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        ContactZoo contactZoo = new ContactZoo();
        for (int i = 0; i < 10; i++) {
            contactZoo.addAnimal(new Racoon(i + 1, i, "Racoon " + i));
        }

        System.out.println(contactZoo.getAnimals());
        Optional<Racoon> optionalRacoon = contactZoo.getRacoonByName("Racoon 5");
        if (optionalRacoon.isPresent()) {
            System.out.println(optionalRacoon.get().getName());
        }
    }

}
