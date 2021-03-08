package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        /*int currvalue = money - price;
        while (currvalue != 0) {
            for (int i = 0; i < coins.length && currvalue != 0; i++) {
                for (int j = 0; j  < currvalue / coins[i]; j++) {
                    rsl[size++] = coins[i];
                }
                currvalue %= coins[i];
            }
        }*/
        int currvalue = money - price;
        for (int i = 0; i < coins.length && currvalue != 0; i++) {
            while (currvalue >= coins[i]) {
                rsl[size++] = coins[i];
                currvalue -= coins[i];
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        int[] data = change(100, 35);
        for (int i : data) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
