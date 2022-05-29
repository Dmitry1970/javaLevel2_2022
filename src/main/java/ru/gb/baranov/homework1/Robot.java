package ru.gb.baranov.homework1;

public class Robot implements Participant {

    private int maxRun;
    private int maxJump;
    private String runTrue = "Робот успешно пробежал";
    private String runFalse = "Робот не смог пробежать и больше не соревнуется";
    private String jumpTrue = "Робот успешно перепрыгнул";
    private String jumpFalse = "Робот не смог перепрыгнуть и больше не соревнуется";

    public Robot(int maxRun, int maxJump) {
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
        return "Робот максимально пробежит " + maxRun + " м, " + "максимально прыгнет в высоту на " + maxJump + " м";
    }

}
