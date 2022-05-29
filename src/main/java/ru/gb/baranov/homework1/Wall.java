package ru.gb.baranov.homework1;

public class Wall implements Barrier {

    private int height;

    public Wall(int height) {
        if (height > 0) {
            this.height = height;
        }
    }

    @Override
    public boolean isObstacle(Participant p) {
        System.out.println("Прыжок");
        return p.jump(height);
    }

    @Override
    public String toString() {
        return "Высота стены " + height + " м";
    }
}
