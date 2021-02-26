package ru.job4j.condition;

import java.awt.*;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = third;
        if (first >= second && first >= third) {
            result = first;
        }
        if (second >= first && second >= third) {
            result = second;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(7, 3, 3));
        System.out.println(max(10, 10, 1));

    }
}
