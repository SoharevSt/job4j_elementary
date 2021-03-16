package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        StringBuilder sb = new StringBuilder(s);
        if (s.length() == 0) {
            return "empty";
        } else if (s.length() < 5) {
            return s;
        } else {
            for (int i = 0; i < s.length() - 4; i++) {
                sb.setCharAt(i, '#');
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(code("aaaaa"));
    }
}
