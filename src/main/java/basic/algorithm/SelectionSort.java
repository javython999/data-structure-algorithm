package basic.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        
        System.out.println("단순 정렬");
        System.out.print("요솟수 :");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]:" );
            x[i] = stdIn.nextInt();
        }

        selectionSort(x, nx);

        System.out.println("오름차순으로 정렬 했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }

    static void selectionSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            swap(a, i, min);
            System.out.println(Arrays.toString(a));
        }
    }

    private static void swap(int[]a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }


}