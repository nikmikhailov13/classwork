package academy.codillas.classwork.training5;

public class Cat {
    private final String name;
    private final int age;
    private final int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + "-" + age + "-" + weight;
    }
}
