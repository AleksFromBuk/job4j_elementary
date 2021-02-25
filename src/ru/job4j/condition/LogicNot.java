package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return isPositive(num) && notEven(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return notPositive(num) || isEven(num);
    }

    public static void main(String[] args) {
        System.out.println(LogicNot.isEven(0));
        System.out.println(LogicNot.isEven(3));

        System.out.println(LogicNot.isPositive(0));
        System.out.println(LogicNot.isPositive(-1));
        System.out.println(LogicNot.isPositive(3));

        System.out.println(LogicNot.notEven(3));
        System.out.println(LogicNot.notEven(16));

        System.out.println(LogicNot.notPositive(-0));
        System.out.println(LogicNot.notPositive(3));
        System.out.println(LogicNot.notPositive(-11));

        System.out.println(LogicNot.notEvenAndPositive(3));
        System.out.println(LogicNot.notEvenAndPositive(-7));
        System.out.println(LogicNot.notEvenAndPositive(8));

        System.out.println(LogicNot.evenOrNotPositive(3));
        System.out.println(LogicNot.evenOrNotPositive(11));
        System.out.println(LogicNot.evenOrNotPositive(-4));
    }
}
