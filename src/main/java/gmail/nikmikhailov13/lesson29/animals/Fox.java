package gmail.nikmikhailov13.lesson29.animals;

public class Fox extends Animal {

    private boolean isFeral;

    public Fox(double weigh, int age, boolean isFeral) {
        super(weigh, age);
        this.isFeral = isFeral;
    }

    public boolean isFeral() {
        return isFeral;
    }
}
