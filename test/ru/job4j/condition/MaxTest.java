package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax5To2Then5() {
        int left = 5;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 5;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax8To8Then8() {
        int left = 8;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 8;
        assertEquals(result, expected);
    }
}