package academy.codillas.classwork.lesson29.animals;

import java.util.Arrays;
import java.util.Optional;

public class Zoo {

    private int maxAnimals;
    private int animalCount;
    private Animal[] animals;

    public Zoo(int maxAnimals) {
        animals = new Animal[maxAnimals];
        this.maxAnimals = maxAnimals;
        this.animalCount = 0;
    }

    public Optional<Fox> searchFoxByName(String name){
        for (Animal animal : animals) {
            Fox fox = (Fox) animal;
            if (fox.getName().equals(name)){
                return Optional.of(fox);
            }
        }
        return Optional.empty();
    }

    public void add(Animal animal) {
        if (animalCount >= maxAnimals) {
            extendZoo(maxAnimals + 1);
        }
        animals[animalCount] = animal;
        animalCount++;
    }

    public void extendZoo(int newMaxAnimals) {
        Animal[] newAnimals = new Animal[newMaxAnimals];
        for (int i = 0; i < maxAnimals; i++) {
            newAnimals[i] = animals[i];
        }
        this.animals = newAnimals;
        this.maxAnimals = newMaxAnimals;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                '}';
    }
}
