package ru.gb.baranov.homework1;

public class Treadmill implements Barrier {

    private int length;

    public Treadmill(int length) {
        if (length > 0)
            this.length = length;
    }


    @Override
    public boolean isObstacle(Participant p) {
        System.out.println("Бег");
        return p.run(this.length);
    }

    @Override
    public String toString() {
        return "Длина беговой дорожки " + length + " м";
    }
}
