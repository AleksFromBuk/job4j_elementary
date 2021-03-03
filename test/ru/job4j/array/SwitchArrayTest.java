package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap03to7() {
        int[] input = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expect = {8, 1, 2, 3, 4, 5, 6, 7, 0, 9};
        int[] rsl = SwitchArray.swap(input, 0, input[8]);
        assertThat(rsl, is(expect));
    }
}