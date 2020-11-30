package ru.geekbains.DZ;

import java.util.*;
//import java.util.Iterator;


public class PhoneBook {

    private static Map<String, Set<String>> PhoneBook = new HashMap<String, Set<String>>();

    public static void add(String name, String phone) {
        if (PhoneBook.containsKey(name)) {
            PhoneBook.get(name).add(phone);
//            System.out.println(name + " has been put with phone " + phone);
            // ссылка на ключ
        } else {
            Set<String> numbers = new HashSet<String>();
            numbers.add(phone);
            PhoneBook.put(name, numbers);
//            System.out.println(PhoneBook.keySet() + " " + PhoneBook.values());
        }
    }

    public static void get(String name) {
//        System.out.println(PhoneBook.get(name));
        for (Map.Entry i: PhoneBook.entrySet()) {
            if (i.getKey() == name) {
                System.out.println(i.getKey() + " phone numbers: " + i.getValue());
            }
        }
//        String numbers = "";
//        for (Map.Entry entry : PhoneBook.entrySet()) {
//            if (entry.getKey() == name) {
////                numbers += entry.getValue() + "";
//                return entry.getValue();


    }

}

