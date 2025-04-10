package gmail.nikmikhailov13.collections;

import java.util.*;

public class WordUtils {

    /**
     * Створити Клас WordUtils у якого є метод:
     * getShortestWord(List words) - знаходить найкоротше слово
     * Знайти всі унікальні слова у реченні
     * Знайти всі дублікати
     * Порахувати кількість входжень слів у речення
     */

    public static String findLongestWord(List<String> words) {

        //  "oo", "one", "five", "abracadabra"
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static String findShortestWords(List<String> words) {
        String shortestWord = words.get(0);
        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }
        return shortestWord;
    }

    public static Set<String> findUniqueWords(List<String> words) {
        Set<String> set = new HashSet<>();
        set.addAll(words);

        return set;
    }

    public static Map<String, Integer> countWordInSentence(List<String> words) {
        Map<String, Integer> map = new MyHashMap<>();
        //  "oo", "one", "five", "abracadabra", "abracadabra"
        for (String word : words) {
            if (map.get(word) != null) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        return map;
    }


}
