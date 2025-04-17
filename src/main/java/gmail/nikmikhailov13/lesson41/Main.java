package gmail.nikmikhailov13.lesson41;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(2);
        list2.add(3);

        Set<Integer> mergedSet = mergeTwoLists(list1, list2);

        System.out.println(mergedSet);

        int sumOfOddNumbers = sumOddNumbers(list1);

        System.out.println(sumOfOddNumbers);
    }

    // Напишіть метод, який приймає список цілих чисел (List<Integer>) та повертає суму всіх
    // непарних чисел ( if (num % 2 != 0) ) у цьому списку.
    public static int sumOddNumbers(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                sum += number;
            }
        }
        return sum;
    }

    // Напишіть метод, який приймає два списки цілих чисел і повертає
    // множину (Set) з елементів, спільних для обох списків.
    public static Set<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>();

        for (int number : list1) {
            set1.add(number);
        }

        for (int number : list2) {
            set1.add(number);
        }

        return set1;
    }
}
