package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int tmp = d;
        while (n  - d > tmp) {
            d += tmp;
        }
        return  n - d < tmp && n - d > 0 ? n - d : 0;
    }

    public static void main(String[] args) {
        System.out.println(mod(5, 3));
        System.out.println(mod(6, 3));
        System.out.println(mod(7, 2));
        System.out.println(mod(8, 3));
        System.out.println(mod(0, 7));
        System.out.println(mod(19, 5));
    }
}
