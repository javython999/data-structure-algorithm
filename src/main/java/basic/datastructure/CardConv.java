package basic.datastructure;

import java.util.Arrays;

public class CardConv {
    public static void main(String[] args) {
        char[] d = new char[10];
        int i = cardConv(59, 16, d);
        System.out.println(Arrays.toString(d));
    }

    static int cardConv(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);

        for (int i = 0; i < digits / 2; i++) {
            char t = d[i];
            d[i] = d[digits - i -1];
            d[digits - i -1] = t;
        }

        return digits;
    }
}
