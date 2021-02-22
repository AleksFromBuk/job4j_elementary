package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);

        short height2 = 170;
        double man2 = Fit.manWeight(height2);
        System.out.println("Man 170 is " + man2);

        short height3 = 175;
        double woman = Fit.womanWeight(height3);
        System.out.println("Man 175 is " + woman);
    }
}
