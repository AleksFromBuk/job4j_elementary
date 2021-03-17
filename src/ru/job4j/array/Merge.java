package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        if (left.length == 0 ||  right.length == 0) {
            rsl = right.length == 0 ?  left : right;
            return rsl;
        }
        for (int i = 0, j = 0, k = 0; i < rsl.length;) {

            if (j == left.length) {
                while (i < rsl.length) {
                    rsl[i++] = right[k++];
                }
                return rsl;
            }
            if (k == right.length) {
                while (i < rsl.length) {
                    rsl[i++] = left[j++];
                }
                return rsl;
            }
            if (left[j] < right[k]) {
                rsl[i++] = left[j];
                j++;
            } else {
                rsl[i++] = right[k];
                k++;
            }
        }

        /*int id = 0;
        if (left.length == 0 ||  right.length == 0) {
            rsl = right.length == 0 ?  left : right;
            return rsl;
        }
        for (int i = 0, j = 0; i < left.length; i++) {
            for (; j < right.length; j++) {
                if (left[i] >= right[j]) {
                    rsl[id++] = right[j];
                } else {
                    rsl[id++] = left[i];
                    if (i == left.length - 1) {
                        while (id < left.length + right.length) {
                            rsl[id++] = right[j++];
                        }
                    }
                    break;
                }
            }
            if (j == right.length) {
                while (id < left.length + right.length) {
                    rsl[id++] = left[i++];
                }
            }
        }*/
        return rsl;
    }

    public static void main(String[] args) {
        int[] ans = merge(new int[]{1, 2}, new int[]{3, 4});
        for (int id : ans) {
            System.out.print(id + " ");
        }
    }
}