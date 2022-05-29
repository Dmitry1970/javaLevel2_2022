package ru.gb.baranov.homework1;

public class MainApp {

    public static void main(String[] args) {
        Participant[] team = new Participant[3];
        team[0] = new Robot(850, 5);
        team[1] = new Human(500, 3);
        team[2] = new Cat(100, 1);
        Barrier[] value = new Barrier[2];
        value[0] = new Treadmill(500);
        value[1] = new Wall(2);

        for (Participant participant : team) {
            System.out.println(participant);
            for (Barrier barrier : value) {
                System.out.println(barrier);
                if (!barrier.isObstacle(participant)) break;
            }
        }


    }

}
