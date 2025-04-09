package gmail.nikmikhailov13.lesson29.animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ContactZoo {

    private List<Animal> animals;

    public ContactZoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void removeAnimal(Animal animal) {
        boolean removed = this.animals.remove(animal);

        if (removed) {
            System.out.println("Animal removed");
        } else {
            System.out.println("Animal was not removed");
        }
    }

    public Optional<Racoon> getRacoonByName(String name) {
        for (Animal animal : this.animals) {
            Racoon racoon = (Racoon) animal;
            if (racoon.getName().equals(name)) {
                return Optional.of(racoon);
            }
        }

        return Optional.empty();
    }
}
