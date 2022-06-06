package ru.gb.baranov.homework3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class WordArray {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("слово");
        words.add("окно");
        words.add("дверь");
        words.add("java");
        words.add("вода");
        words.add("слово");
        words.add("вишня");
        words.add("машина");
        words.add("погода");
        words.add("книга");
        words.add("трава");
        words.add("вода");
        words.add("компьютер");
        words.add("java");
        words.add("тетрадь");
        words.add("массив");
        words.add("телефон");
        words.add("яблоко");


        HashSet<String> set = new HashSet<>(words);
        System.out.println(set);

        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : words) {
            if (!wordToCount.containsKey(word)) {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet()) {
            System.out.println(word + " " + wordToCount.get(word));
        }


    }
}


