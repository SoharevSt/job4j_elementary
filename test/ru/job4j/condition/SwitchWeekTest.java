package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void when1ThenMonday() {
        String expected = "Понедельник";
        String actual = SwitchWeek.nameOfDay(1);
        assertEquals(expected, actual);
    }

    @Test
    public void when2ThenTuesday() {
        String expected = "Вторник";
        String actual = SwitchWeek.nameOfDay(2);
        assertEquals(expected, actual);
    }

    @Test
    public void when3ThenWednesday() {
        String expected = "Среда";
        String actual = SwitchWeek.nameOfDay(3);
        assertEquals(expected, actual);
    }

    @Test
    public void when4ThenThursday() {
        String expected = "Четверг";
        String actual = SwitchWeek.nameOfDay(4);
        assertEquals(expected, actual);
    }

    @Test
    public void when5ThenFriday() {
        String expected = "Пятница";
        String actual = SwitchWeek.nameOfDay(5);
        assertEquals(expected, actual);
    }

    @Test
    public void when6ThenSaturday() {
        String expected = "Суббота";
        String actual = SwitchWeek.nameOfDay(6);
        assertEquals(expected, actual);
    }

    @Test
    public void when7ThenSunday() {
        String expected = "Воскресенье";
        String actual = SwitchWeek.nameOfDay(7);
        assertEquals(expected, actual);
    }

    @Test
    public void when9ThenError() {
        String expected = "Ошибка";
        String actual = SwitchWeek.nameOfDay(9);
        assertEquals(expected, actual);
    }
}