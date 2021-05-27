package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
    return sum(first, second)
            + multiply(first, second);
    }

    public static double sumDiffAndDiv(double first, double second) {
        return diff(first, second) + div(first, second);
    }

    public static double totalSum(double first, double second) {
        return sum(first, second) + multiply(first, second) + diff(first, second) + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчет равен: " + sumAndMultiply(10, 20));
        System.out.println("применение метода, который суммирует результаты всех функций: " + totalSum(10, 2));
        System.out.println("применение метода, который суммирует результаты всех функций: " + totalSum(10, 0));
    }
}
