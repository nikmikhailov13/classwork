package academy.codillas.classwork.lesson29.animals;

public class GroomingSalon {

    private String name;

    public GroomingSalon(String name) {
        this.name = name;
    }

    public void groom(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            System.out.println("Підстригли кота по імені " + cat.getName());
        } else if (animal instanceof Fox) {
            Fox fox = (Fox) animal;
            if (fox.isFeral()) {
                System.out.println("Не змогли підстригти лисичку, бо вона скажена!");
            } else {
                System.out.println("Постриги лисичку ");
            }
        }

    }
}
