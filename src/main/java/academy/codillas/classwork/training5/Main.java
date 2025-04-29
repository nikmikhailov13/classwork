package academy.codillas.classwork.training5;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*
         * Знайти всіх котів старших за 5 років.
         * Підрахувати кількість котів, вага яких більша за 4 кг.
         * Знайти найважчого кота.
         * Створити список імен котів, відсортованих за віком у зростаючому порядку.
         * Перевірити, чи є хоча б один кіт молодший за 1 рік.
         * Вивести на екран всіх котів, чиї імена починаються на "M".
         */

        String[] catNames = new String[]{
                "Morsik", "Pupik", "Flufik", "Goofik", "Murchik"
        };

        int[] catAges = new int[]{
                11, 10, 3, 5, 9
        };

        int[] catWeights = new int[]{
                1, 5, 8, 2, 6
        };

        List<Cat> cats = new ArrayList<>();

        for (int i = 0; i < catNames.length; i++) {
            String catName = catNames[i];
            int catAge = catAges[i];
            int catWeight = catWeights[i];

            Cat cat = new Cat(catName, catAge, catWeight);

            cats.add(cat);
        }

        List<Cat> catsOlderThanFiveYearsOld = cats.stream()
                .filter(cat -> cat.getAge() > 5)
                .toList();
                // .collect(Collectors.toUnmodifiableList()); // close for modification | immutable
                // .toList(); // close for modification | immutable
                // .collect(Collectors.toList()); // open for modification


        System.out.println(catsOlderThanFiveYearsOld);

        // Підрахувати кількість котів, вага яких більша за 4 кг.
        long numberOdCatsHeavierThan4Kg = cats.stream()
                .filter(cat -> cat.getWeight() > 4)
                .count();


        Optional<Cat> heaviestCatOptional = cats.stream()
                .max(Comparator.comparingInt(Cat::getWeight));

        System.out.println(heaviestCatOptional.get());

        if (heaviestCatOptional.isPresent()) {
            System.out.println("Heaviest cat -> " + heaviestCatOptional.get());
        }

        // Створити список імен котів, відсортованих за віком у зростаючому порядку.
        List<String> catNamesSortedByAgeAsc = cats.stream()
                .sorted(Comparator.comparingInt(Cat::getAge))
                .map(Cat::getName)
                // .map(cat -> cat.getName())
                .toList();

        System.out.println(catNamesSortedByAgeAsc);

        // Перевірити, чи є хоча б один кіт молодший за 1 рік.
        boolean atLeastOneCatYoungerThan1YearOld = cats.stream()
                .anyMatch(cat -> cat.getAge() < 1);

        System.out.println("atLeastOneCatYoungerThan1YearOld -> " + atLeastOneCatYoungerThan1YearOld);

        // Вивести на екран всіх котів, чиї імена починаються на "M".
        cats.stream()
                .filter(cat -> cat.getName().toCharArray()[0] == 'M')
                .forEach(System.out::println);

        Map<Object, Object> map = new HashMap<>();

        // Just for Fun | WORKS!
        map.put(null, null);
        map.put(null, null);

        System.out.println(map.size());
    }
}
