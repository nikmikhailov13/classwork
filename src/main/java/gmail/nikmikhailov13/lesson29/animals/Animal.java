package gmail.nikmikhailov13.lesson29.animals;

public class Animal {
    private double weigh;
    private int age;

    public Animal(double weigh, int age) {
        this.weigh = weigh;
        this.age = age;
    }

    public double getWeigh() {
        return weigh;
    }

    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
