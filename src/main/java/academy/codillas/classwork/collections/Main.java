package academy.codillas.classwork.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // list
        List<String> initialArrayList = new ArrayList<>();
        List<String> newArrayList = new ArrayList<>();

        List<String> stringList = List.of("string1", "string2", "string3");

        List<String> list = new ArrayList<>(initialArrayList);
        list.addAll(newArrayList);
        list.addAll(stringList);

        for (int i = 0; i < 10000; i++) {
            list.add("hello");
        }
        System.out.println(list);
        list.clear();
        System.out.println(list);

        // set
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);

        Set<Integer> integerSet = Set.of(3, 4, 5, 6);
        set.addAll(integerSet);
        set.add(7);
        set.add(8);
        set.remove(7);

        System.out.println(set);

        // map
        Map<Number, String> map = new HashMap<>();
        map.put(1, "one");
        map.putAll( Map.of(2, "two", 3, "three"));

        map.put(4.0d, "four");
        map.put(5.0f, "five");

        Collection<String> values = map.values();
        Set<Number> numbers = map.keySet();

        map.replace(1, "один");
        System.out.println(map);


        String longestWord = WordUtils.findLongestWord(List.of("oo", "one", "five", "abracadabra"));
        System.out.println(longestWord);

        String shortestWord = WordUtils.findShortestWords(List.of("oo", "one", "five", "abracadabra", "o"));
        System.out.println(shortestWord);

        System.out.println(WordUtils.findUniqueWords(List.of("oo", "one", "five", "abracadabra", "o", "abracadabra")));

        Map<String, Integer> stringIntegerMap = WordUtils.countWordInSentence(List.of("oo", "one", "five", "abracadabra", "o", "abracadabra"));
        System.out.println(stringIntegerMap);
    }
}
