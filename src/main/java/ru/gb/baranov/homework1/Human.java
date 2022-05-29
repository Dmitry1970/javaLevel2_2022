package ru.gb.baranov.homework1;

public class Human implements Participant {

    private int maxRun;
    private int maxJump;
    private String runTrue = "Человек успешно пробежал";
    private String runFalse = "Человек не смог добежать и его соревнования закончились";
    private String jumpTrue = "Человек успешно перепрыгнул";
    private String jumpFalse = "Человек не смог перепрыгнуть и его сревнования закончились";

    public Human(int maxRun, int maxJump) {
        if (maxRun > 0) {
            this.maxRun = maxRun;
        }
        if (maxJump > 0) {
            this.maxJump = maxJump;
        }
    }

    @Override
    public boolean run(int length) {
        System.out.println((length <= maxRun) ? runTrue : runFalse);
        return length <= maxRun;
    }

    @Override
    public boolean jump(int height) {
        System.out.println((height <= maxJump) ? jumpTrue : jumpFalse);
        return height <= maxJump;
    }

    @Override
    public String toString() {
        return "Человек максимально пробежит " + maxRun + " м, " + "максимально прыгнет в высоту на " + maxJump + " м";
    }

}
