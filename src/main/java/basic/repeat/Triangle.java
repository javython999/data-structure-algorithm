package basic.repeat;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력합니다.");

        do {
            System.out.print("몇 단 삼각형입니까?: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        //tiangleLeftBottom(n);
        //triangleLeftUp(n);
        triangleRightUp(n);
    }

    private static void tiangleLeftBottom(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            if (i != n) {
                System.out.println();
            }
        }
    }

    private static void triangleLeftUp(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >= 0; j--) {
                System.out.print("*");
            }

            if (i != n) {
                System.out.println();
            }
        }
    }

    private static void triangleRightUp(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i-1; j++) {
                System.out.print(' ');
            }

            for (int j = 0; j <= n - i; j++) {
                System.out.print('*');
            }

            if (i != n) {
                System.out.println();
            }
        }
    }

}
