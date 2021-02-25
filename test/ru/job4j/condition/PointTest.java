package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when30to04then5() {
        double expected = 5;
        double out = Point.distance(3, 0, 0, 4);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when35to1514then15() {
        Assert.assertEquals(15, Point.distance(3, 5, 15, 14), 0.01);
    }

}