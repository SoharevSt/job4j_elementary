package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        String s = Integer.toString(i);
        boolean b  = true;
        for (int j = 0, k = s.length() - 1; j < s.length() / 2; j++, k--) {
            if (s.charAt(j) != s.charAt(k)) {
                b = false;
                break;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(check(123321));
    }
}
