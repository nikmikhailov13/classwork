package gmail.nikmikhailov13.lesson16.animals;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cat {
    public static final boolean HAS_TAIL = true;
    private String name;
    private int age;
    private double weight;
    private Breed breed;


    public void voice() {
        if (age > 4) {
        } else {
            System.out.println("Miau-Miau");
        }

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name +
                ", age=" + age +
                ", weight=" + weight +
                ", breed=" + breed +
                '}';
    }

}
