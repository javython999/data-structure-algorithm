package basic.searchalgorithm;

import java.util.Scanner;

public class SeqSearchSen {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] :");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값: ");
        int ky = stdIn.nextInt();

        //int idx = seqSearchSen(x, num, ky);
        int idx = seqSearchSenFor(x, num, ky);

        if (idx == -1) {
            System.out.println("해당 값의 요소가 존재하지 않습니다.");
        } else {
            System.out.print("해당 값은 x[" + idx + "]에 있습니다.");
        }
    }

    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;
        a[n] = key;

        while (true) {
            if (a[i] == key) break;

            i++;
        }

        return i == n ? -1 : i;
    }

    static int seqSearchSenFor(int[] a, int n, int key) {
        int i;
        a[n] = key;

        for (i = 0; a[i] != key; i++) {
            ;
        }
        return i == n ? -1 : i;
    }
}
