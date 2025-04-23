package academy.codillas.classwork.lesson29.animals;

public class Racoon extends Animal {

    private String name;

    public Racoon(double weigh, int age, String name) {
        super(weigh, age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Racoon{" +
                "name='" + name + '\'' +
                '}';
    }
}
