package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SortSelectedTest {

    @Test
    public void whenFiveElementsSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenEightElementsSort() {
        int[] input = new int[] {7, 6, 5, 4, 3, 2, 1, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 1, 2, 3, 4, 5, 6, 7};
        assertThat(result, is(expect));
    }

    @Test
    public void whenThreeElementsSort() {
        int[] input = new int[] {7, 3, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 3, 7};
        assertThat(result, is(expect));
    }

}