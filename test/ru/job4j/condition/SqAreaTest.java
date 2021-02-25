package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenp4k1thenS1() {
        Assert.assertEquals(SqArea.square(4, 1), 1, 0.01);
    }

    @Test
    public void whenp6k2thenS2() {
        Assert.assertEquals(SqArea.square(6, 2), 2, 0.01);
    }
}