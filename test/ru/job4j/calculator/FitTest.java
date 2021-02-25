package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double out = Fit.manWeight(in);
        double expected = 92;
        Assert.assertEquals(expected, out,  0.01);
    }

    @Test
    public void whenWoman170Then69() {
        short in = 170;
        double out = Fit.womanWeight(in);
        double expected = 69.0;
        Assert.assertEquals(out, expected, 0.01);
    }
}