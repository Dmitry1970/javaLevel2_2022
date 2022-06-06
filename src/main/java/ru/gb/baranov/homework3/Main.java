package ru.gb.baranov.homework3;

public class Main {

    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();
        phonebook.add("Иванов", "899991234567");
        phonebook.add("Петров", "89153456783");
        phonebook.add("Сидоров", "89027773425");
        phonebook.add("Иванов", "89037739876");
        phonebook.add("Кузнецов", "89105553422");
        phonebook.add("Иванов", "89883452132");
        System.out.println("Телефонный справочник: ");
        phonebook.getInfoTotal();
        phonebook.getInfo("Иванов");
        phonebook.getInfo("Петров");


    }
}
