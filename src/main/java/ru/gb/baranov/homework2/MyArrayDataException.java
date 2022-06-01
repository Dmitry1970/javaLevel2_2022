package ru.gb.baranov.homework2;

public class MyArrayDataException extends Exception {
    private int i;
    private int j;
    private String[][] a;

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public String[][] getA() {
        return a;
    }

    public MyArrayDataException(int i, int j, String[][] a) {
        this.i = i;
        this.j = j;
        this.a = a;
    }

}
