package ru.job4j.condition;

public class Max {

    public static int ma(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(ma(3, 4));
    }
}
