package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1- y2), 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 3, 4);
        System.out.println("result (0, 0) to (3, 4) " + result);

        result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        result = Point.distance(13, 10, 1, 1);
        System.out.println("result (13, 10) to (1, 1) " + result);
    }
}
