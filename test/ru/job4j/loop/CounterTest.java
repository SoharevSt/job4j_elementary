package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumNumbersFromThreeToEightThenThirtyThree() {
        int start = 3;
        int finish = 8;
        int result = Counter.sum(start, finish);
        int expected = 33;
        assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromZeroToFiveThenSix() {
        int start = 0;
        int finish = 5;
        int result = Counter.sumByEven(start, finish);
        int expected = 6;
        assertEquals(expected, result);
    }
}