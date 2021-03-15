package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6ToK2Then2() {
        int p = 6;
        int k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12ToK2Then8() {
        int p = 12;
        int k = 2;
        double expected = 8;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4ToK1Then1() {
        int p = 4;
        int k = 1;
        double expected = 1;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}