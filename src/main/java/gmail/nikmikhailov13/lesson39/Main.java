package gmail.nikmikhailov13.lesson39;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);

        words.add("String");

        Box<Integer> box = new Box<>();

        box.add(123);

        System.out.println(box.get());

        box.remove();

        System.out.println(box.get());

        Integer a = box.doSmth(123);
    }
}
