package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        int size = array.length - 1;
        for (int i = 0; size - i > i; i++) {
            int tmp = array[i];
            array[i] = array[size - i ];
            array[size - i ] = tmp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        back(array);
        for (int id: array) {
            System.out.print(id + " ");
        }
        System.out.println();
    }
}
