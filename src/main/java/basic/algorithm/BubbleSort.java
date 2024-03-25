package basic.algorithm;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("버블 정렬(버전1)");
        System.out.print("요솟수 :");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]:" );
            x[i] = stdIn.nextInt();
        }

        bubbleSort4(x, nx);

        System.out.println("오름차순으로 정렬 했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }

    private static void bubbleSort(int[] x, int nx) {
        for (int i = 0; i < nx - 1; i++) {
            for (int j = nx - 1; j > i; j--) {
                if (x[j - 1] > x[j]) {
                    swap(x, j -1, j);
                }
            }
        }
    }

    private static void swap(int[]a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }


    // 5 4 3 2 1
    private static void bubbleSort2(int[] x, int nx) {
        for (int i = 0; i < nx; i++) {
            for (int j = i + 1; j < nx; j++) {
                if (x[i] > x[j]) {
                    swap(x, j, i);
                }
            }
        }
    }

    private static void bubbleSort3(int[] x, int nx) {
        for (int i = 0; i < nx - 1; i++) {
            int exchg = 0;
            for (int j = nx - 1; j > i; j--) {
                if (x[j - 1] > x[j]) {
                    swap(x, j -1, j);
                    exchg++;
                }
            }

            if (exchg == 0) break;
        }
    }

    private static void bubbleSort4(int[] x, int nx) {
        int k = 0;

        while (k < nx - 1) {
            int last = nx - 1;

            for (int j = nx -1; j > k; j--) {
                if (x[j - 1] > x[j]) {
                    swap(x, j - 1, j);
                    last = j;
                }
            }

            k = last;
        }
    }
}
