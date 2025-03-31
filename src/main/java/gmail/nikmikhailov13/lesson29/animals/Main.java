package gmail.nikmikhailov13.lesson29.animals;

public class Main {

    public static void main(String[] args) {
        GroomingSalon salon = new GroomingSalon("Paws & Tails");

        Cat cat = new Cat(5.0, 3, "Amur", Breed.SCOTISH);
        Fox fox = new Fox(5.0, 3, true);

        salon.groom(cat);
        salon.groom(fox);

    }


}
