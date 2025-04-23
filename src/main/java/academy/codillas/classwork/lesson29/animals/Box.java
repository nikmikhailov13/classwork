package academy.codillas.classwork.lesson29.animals;

public class Box {
    private Cat cat;

    public Box() {
    }

    public Box(Cat cat) {
        this.cat = cat;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
