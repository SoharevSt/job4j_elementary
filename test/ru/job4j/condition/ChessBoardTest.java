package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    @Test
    public void whenWayIs5Then5() {
        int x1 = 6;
        int y1 = 7;
        int x2 = 1;
        int y2 = 2;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    public void whenWayIs7Then7() {
        int x1 = 7;
        int y1 = 0;
        int x2 = 0;
        int y2 = 7;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 7;
        assertEquals(expected, result);
    }

    @Test
    public void whenWayIs4And5Then0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void whenWayIs0Then0() {
        int x1 = 0;
        int y1 = 6;
        int x2 = 0;
        int y2 = 6;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        assertEquals(expected, result);
    }
}