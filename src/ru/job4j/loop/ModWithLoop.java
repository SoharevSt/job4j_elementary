package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int res = 0;
        while (n >= d) {
            res = n - d;
            n -= d;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(mod(0, 4));
    }
}
