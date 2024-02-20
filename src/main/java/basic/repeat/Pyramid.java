package basic.repeat;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("피라미드를 출력합니다.");

        do {
            System.out.print("몇 단 피라미드입니까?: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        //pyramid(n);
        pyramidNumber(n);
    }

    private static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }

            for (int j = 1; j <= (i-1)*2+1; j++) {
                System.out.print('*');
            }

            if (i != n) {
                System.out.println();
            }
        }
    }

    private static void pyramidNumber(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }

            for (int j = 1; j <= (i-1)*2+1; j++) {
                System.out.print(i%10);
            }

            if (i != n) {
                System.out.println();
            }
        }
    }
}
