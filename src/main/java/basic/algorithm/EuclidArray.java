package basic.algorithm;

import java.util.Scanner;

public class EuclidArray {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("몇 개 정수의 최대 공약수를 구할까요? : ");
        int num;
        do {
            num = stdIn.nextInt();
        } while (num <= 1);

        int[] x = new int[num];					// 길이가 num 인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.println("최대 공약수는 " + gcdArray(x, 0, num) + "입니다.");
    }

    static int gcdArray(int a[], int start, int end) {
        if (end == 1)
            return a[start];
        else if (end == 2)
            return gcd(a[start], a[start + 1]);
        else
            return gcd(a[start], gcdArray(a, start + 1, end - 1));
    }

    static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
