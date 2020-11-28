package ru.geekbains.DZ;

import java.util.HashMap;
//import java.util.HashSet; //сначала сделал им, не прочитав задание до конца )

public class Main {

    public static void main(String[] args) {
        String[] words = {
          "Marry",
          "had",
          "a",
          "little",
          "lamb",
          "little",
          "lamb",
          "little",
          "lamb",
          "whose",
          "fleece",
          "was",
          "white",
          "as",
          "snow",
        };

        HashMap<String, Integer> uniqueWords = new HashMap<String, Integer>();
        for (String strings : words) {
            if (uniqueWords.containsKey(strings)) {
                int value = uniqueWords.get(strings);
                uniqueWords.put(strings, value+1);
//                uniqueWords.values(strings) = uniqueWords.values()+1
            }    //{uniqueWords.replace(strings, value, value+1)} // изящно не получилось
            else
            uniqueWords.put(strings, 1);

        }
        System.out.println(String.format("There are %s unique words in an Array: %s", uniqueWords.size(), uniqueWords.toString()));

    }
}
