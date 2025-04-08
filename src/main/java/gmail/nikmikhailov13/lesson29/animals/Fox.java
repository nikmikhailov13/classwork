package gmail.nikmikhailov13.lesson29.animals;

import java.util.Objects;

public class Fox extends Animal {

    private boolean isFeral;
    private String name;

    public Fox(double weigh, int age, String name, boolean isFeral) {
        super(weigh, age);
        this.isFeral = isFeral;
        this.name = name;
    }

    public boolean isFeral() {
        return isFeral;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Fox{" +
                "isFeral=" + isFeral +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Fox fox)) return false;
        return super.getWeigh() == fox.getWeigh()
                && super.getAge() == fox.getAge()
                && isFeral == fox.isFeral
                && Objects.equals(name, fox.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isFeral, name);
    }
}
