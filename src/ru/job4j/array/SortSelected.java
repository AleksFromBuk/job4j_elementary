package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            if (i != index) {
                int tmp = data[index];
                data[index] = data[i];
                data[i] = tmp;
            }
        }
        return data;
    }

    public static void main(String[] args) {
        int[] data =  {7, 6, 5, 4, 3, 2, 1, 1};
        sort(data);
        for (int i: data) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
