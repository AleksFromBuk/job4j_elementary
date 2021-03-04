package ru.job4j.array;

public class Turn {

    /*public static int[] back(int[] array) {
        int size = array.length - 1;
        for (int i = 0; size - i > i; i++) {
            int tmp = array[i];
            array[i] = array[size - i ];
            array[size - i ] = tmp;
        }
        return array;
    }*/
    public static int[] back(int[] array) {
        int size = array.length - 1;
        for (int i = 0; i <= size / 2;  i++) {
            int tmp = array[i];
            array[i] = array[size - i ];
            array[size - i] = tmp;
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

        int[] array2 = {1, 2, 3, 4};
        back(array2);
        for (int id: array2) {
            System.out.print(id + " ");
        }
        System.out.println();

        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8};
        back(array3);
        for (int id: array3) {
            System.out.print(id + " ");
        }
        System.out.println();
    }
}
