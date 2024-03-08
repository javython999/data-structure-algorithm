package basic.searchalgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 :");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0] :" );
        x[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "] :");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]);
        }

        System.out.print("검색할 값: ");
        int ky = stdIn.nextInt();

        int idx = Arrays.binarySearch(x, ky);

        if (idx < 0) {
            int insertPoint = -idx -1;
            System.out.println("그 값의 요소가 없습니다.");
            System.out.printf("삽입 포인트는 %d입니다.\n", insertPoint);
            System.out.printf("x[%d]의 바로 앞에 %d를 삽입하면 정렬상태가 유지됩니다.", insertPoint, ky);
        } else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
        }
    }
}
