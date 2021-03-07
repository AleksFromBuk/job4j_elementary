package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[] {1, 2, 3, 4, 5, 6, 7}, 3, 6));
        System.out.println(findMin(new int[] {1, 2, 3, 4, 5, 6, 7}, 0, 6));
        System.out.println(findMin(new int[] {1, 2, 3, 4, 5, 6, 7}, 6, 6));
    }
}
