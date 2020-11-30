package ru.geekbains.DZ;

import java.util.*;
//import java.util.Iterator;


public class PhoneBook {

    private static Map<String, List<String>> PhoneBook = new HashMap<String, List<String>>();

    public static void add(String name, String phone) {
        if (PhoneBook.containsKey(name)) {
            PhoneBook.get(name).add(phone);
            System.out.println(name + " has been put with phone " + phone);
            // ссылка на ключ
        } else {
            List<String> numbers = new List<String>() {
                @Override
                public int size() {
                    return 0;
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public boolean contains(Object o) {
                    return false;
                }

                @Override
                public Iterator<String> iterator() {
                    return null;
                }

                @Override
                public Object[] toArray() {
                    return new Object[0];
                }

                @Override
                public <T> T[] toArray(T[] a) {
                    return null;
                }

                @Override
                public boolean add(String s) {
                    return false;
                }

                @Override
                public boolean remove(Object o) {
                    return false;
                }

                @Override
                public boolean containsAll(Collection<?> c) {
                    return false;
                }

                @Override
                public boolean addAll(Collection<? extends String> c) {
                    return false;
                }

                @Override
                public boolean addAll(int index, Collection<? extends String> c) {
                    return false;
                }

                @Override
                public boolean removeAll(Collection<?> c) {
                    return false;
                }

                @Override
                public boolean retainAll(Collection<?> c) {
                    return false;
                }

                @Override
                public void clear() {

                }

                @Override
                public boolean equals(Object o) {
                    return false;
                }

                @Override
                public int hashCode() {
                    return 0;
                }

                @Override
                public String get(int index) {
                    return null;
                }

                @Override
                public String set(int index, String element) {
                    return null;
                }

                @Override
                public void add(int index, String element) {

                }

                @Override
                public String remove(int index) {
                    return null;
                }

                @Override
                public int indexOf(Object o) {
                    return 0;
                }

                @Override
                public int lastIndexOf(Object o) {
                    return 0;
                }

                @Override
                public ListIterator<String> listIterator() {
                    return null;
                }

                @Override
                public ListIterator<String> listIterator(int index) {
                    return null;
                }

                @Override
                public List<String> subList(int fromIndex, int toIndex) {
                    return null;
                }
            };
            numbers.add(phone);
            PhoneBook.put(name, numbers);
            System.out.println(PhoneBook.keySet() + " " + PhoneBook.values());
        }
    }

    public static void get(String name) {
//        System.out.println(PhoneBook.get(name));
        for (Map.Entry i: PhoneBook.entrySet()) {
            System.out.println(i.getKey() + " phone numbers: " + i.getValue());
        }
//        String numbers = "";
//        for (Map.Entry entry : PhoneBook.entrySet()) {
//            if (entry.getKey() == name) {
////                numbers += entry.getValue() + "";
//                return entry.getValue();


    }

}

