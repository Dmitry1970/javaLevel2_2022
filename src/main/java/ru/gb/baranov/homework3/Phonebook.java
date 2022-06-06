package ru.gb.baranov.homework3;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    public final Map<String, ArrayList<String>> phonebook = new HashMap<>();
    private ArrayList<String> list = new ArrayList<>();

    void add(String lastname, String phone) {
        if (phonebook.get(lastname) == null) {
            list = new ArrayList<>();
            phonebook.put(lastname, list);
        } else {
            list = phonebook.get(lastname);
        }
        list.add(phone);
    }

    void getInfo(String lastname) {
        if (phonebook != null) {
            list = phonebook.get(lastname);
            System.out.println(lastname + " телефон: ");
            for (String list : list) {
                System.out.println(list + " ");
            }
            System.out.println();
        }

    }

    void getInfoTotal() {
        phonebook.forEach((k, v) -> getInfo(k));
    }


    @Override
    public String toString() {
        return "phonebook{" + "setPhoneNumber=" + list + ", phonebook=" + phonebook + '}';
    }
}




