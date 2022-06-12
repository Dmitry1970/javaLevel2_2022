package ru.gb.baranov.homework5;

public class ThreadHomework {

    public static void main(String[] args) {
        firstMethod();
        secondMethod();
    }

    public static void firstMethod() {
        int size = 10_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;

        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

        }
        System.out.println("One thread time: " + (System.currentTimeMillis() - startTime) + " ms. ");
    }

    public static void secondMethod() {
        int size = 10_000_000;
        int halfSize = size / 2;
        float[] arr = new float[size];
        for (float a : arr) {
            a = 1.0f;
        }
        long startTime = System.currentTimeMillis();

        float[] leftHalf = new float[halfSize];
        float[] rightHalf = new float[halfSize];
        System.arraycopy(arr, 0, leftHalf, 0, halfSize);
        System.arraycopy(arr, halfSize, rightHalf, 0, halfSize);
        Thread threadLeft = new Thread(() -> {
            for (int i = 0; i < leftHalf.length; i++) {
                leftHalf[i] = (float) (leftHalf[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.out.println(Thread.currentThread().getName());
            System.out.println("ThreadLeft time: " + (System.currentTimeMillis() - startTime) + " ms. ");
        });

        Thread threadRight = new Thread(() -> {
            for (int i = 0; i < rightHalf.length; i++) {
                int j = i + halfSize;
                rightHalf[i] = (float) (rightHalf[i] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
            }
            System.out.println(Thread.currentThread().getName());
            System.out.println("ThreadRight time: " + (System.currentTimeMillis() - startTime));
        });

        threadLeft.start();
        threadRight.start();
        try {
            threadLeft.join();
            threadRight.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        float[] mergedArray = new float[size];
        System.arraycopy(leftHalf, 0, mergedArray, 0, halfSize);
        System.arraycopy(rightHalf, 0, mergedArray, halfSize, halfSize);
        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("Merged thread time: " + (System.currentTimeMillis() - startTime) + " ms.");

    }
}



