package ru.gb.baranov.homework1;

    public class Cat implements Participant {

        private int maxRun;
        private int maxJump;
        private String runTrue = "Кот успешно пробежал";
        private String runFalse = "Кот не смог пробежать и его соревнования закончились";
        private String jumpTrue = "Кот успешно перепрыгнул";
        private String jumpFalse = "Кот не смог перепрыгнуть и его соревнования закончились";

        public Cat(int maxRun, int maxJump) {
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
            return height < maxJump;
        }

        public String toString() {
            return "Кот " + "максимально пробежит " + maxRun + " м, " + "максимально прыгнет в высоту на " + maxJump + " м";
        }
    }


