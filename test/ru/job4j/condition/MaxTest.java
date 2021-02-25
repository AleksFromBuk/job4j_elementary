package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2then2() {
        assertThat(Max.ma(1, 2), is(2));
    }

    @Test
    public void whenMax3To2then3() {
        assertThat(Max.ma(3, 2), is(3));
    }

    @Test
    public void whenMax7To7then7() {
        assertThat(Max.ma(7, 7), is(7));
    }

}