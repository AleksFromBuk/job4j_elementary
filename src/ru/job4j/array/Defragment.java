package ru.job4j.array;

public class Defragment {

    public static String[] swap(String[] array, int nullIndex, int notNullIndex) {
        array[nullIndex] = array[notNullIndex];
        array[notNullIndex] = null;
        return array;
    }

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int i = point + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        swap(array, point, i);
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println();
        String[] inputMore = {"к", null, "сожалению", null, "снова", null, "залил", null, "поверх", null, "старого задания"};
        String[] compressed2 = compress(inputMore);
        System.out.println();
        for (int index = 0; index < compressed2.length; index++) {
            System.out.print(compressed2[index] + " ");
        }

    }
}
