package gmail.nikmikhailov13.lesson29.animals;

public class Cat extends Animal {

    private Breed breed;
    private String name;

    public Cat(double weigh, int age, String name, Breed breed) {
        super(weigh, age);
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }
}
