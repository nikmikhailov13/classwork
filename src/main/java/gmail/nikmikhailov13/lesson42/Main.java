package gmail.nikmikhailov13.lesson42;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<String> containsNina = (String sentence) -> sentence.contains("Nina");

        String sentence = "Today we have Vadym, Taras, Volodymyr, Rostyslav, Mykonos :)";

        boolean result = containsNina.test(sentence);

        System.out.println(result);

        List<Integer> list = new ArrayList<>();

        list.forEach((element) -> {
            System.out.println(element);
        });


        // 20, 50 -> 2050
        BinaryOperator<Integer> magicAddition = (p1, p2) -> {
            // "20"
            String p1Str = p1.toString();
            // "50"
            String p2Str = p2.toString();

            // "2050"
            String resultStr = p1Str + p2Str;

            // 2050
            return Integer.parseInt(resultStr);
        };

        int res = magicAddition.apply(1, 11);
        System.out.println(res * 6);
    }
}
