package ru.gb.baranov.homework2;

public class TaskArray {

    public static void main(String[] args) {

        TaskArray test = new TaskArray();

        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] arr1 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8", "9"},
                {"9", "m", "11", "12"},
                {"13", "14", "15", "16"}

        };


        try {
            int result = test.arrayTest(arr1);
            System.out.println("result = " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Размер массива не соответствует");
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка в ячейке [" + e.getI() + "][" + e.getJ() + "]" + ", в ней значение " + e.getA()[e.getI()][e.getJ()]);
            e.printStackTrace();
        }

    }

    public int arrayTest(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (array.length != 4) {
            throw new MyArraySizeException("Количество строк отличается");
        }
        for (int i = 0; i < array.length; i++) {


            if (array[i].length != 4)
                throw new MyArraySizeException(String.format("Количество столбцов в строке %d отличается", i));
            for (int j = 0; j < array.length; j++) {
                try {
                    count = count + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array);
                }
            }

        }
        return count;
    }
}