package ru.job4j.loop;

public class Hamming {

    public static int checkStrings(String left, String right) {
        int count = 0;
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) != right.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String l = "ASDF";
        String r = "AADF";
        System.out.println(checkStrings(l, r));
    }
}
