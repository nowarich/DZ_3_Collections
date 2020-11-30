package ru.geekbains.DZ;

import java.util.HashMap;
import java.util.Map;
//import java.util.HashSet; //сначала сделал им, не прочитав задание до конца )

public class Main {

    public static void main(String[] args) {
//        String[] words = {
//          "Marry",
//          "had",
//          "a",
//          "little",
//          "lamb",
//          "little",
//          "lamb",
//          "little",
//          "lamb",
//          "whose",
//          "fleece",
//          "was",
//          "white",
//          "as",
//          "snow",
//        };
//
//        Map<String, Integer> uniqueWords = new HashMap<String, Integer>();
//        for (String strings : words) {
//            if (uniqueWords.containsKey(strings)) {
//                int value = uniqueWords.get(strings);
//                uniqueWords.put(strings, value+1);
///////                uniqueWords.values(strings) = uniqueWords.values()+1
//            }    /////{uniqueWords.replace(strings, value, value+1)} // изящно не получилось
//            else
//            uniqueWords.put(strings, 1);
//
//        }
//        System.out.println(String.format("There are %s unique words in an Array: %s", uniqueWords.size(), uniqueWords.toString()));
///////////////////////////////////////// TASK 2 /////////////////////////////
//        Map<String, Long> phoneBook = new HashMap<String, Long>();
//
//        phoneBook.put("Петя", 89161234567L);
////        phoneBook.put("Петя", 89161234568L);
//        phoneBook.put("Вася", 89161245567L);
//        phoneBook.put("Ваня", 89161239567L);
//        String result = "";
//        for (Map.Entry i : phoneBook.entrySet()) {
//            if (i.getKey() == "Петя"); {
//                result += i.getValue() + "";      // НЕ ПОЛУЧИЛОСЬ ИЗ-ЗА SET - ИДЁТ ПЕРЕЗАПИСЬ ПО КЛЮЧУ, НАДО ТЕЛЕФОН - STRING И ДОПИСЫВАТЬ ТУДА
//            }
//
//        }
//        System.out.println(phoneBook.get("Петя"));
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Петя", "89161234567");
        phoneBook.add("Петя", "89161234568");
        phoneBook.add("Вася", "89161245567");
        phoneBook.add("Ваня", "89161239567");
//        System.out.println(phoneBook. ("Петя"));
        System.out.println(phoneBook.toString());
        phoneBook.get("Петя");
    }
}
