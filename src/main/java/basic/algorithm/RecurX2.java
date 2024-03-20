package basic.algorithm;

import basic.datastructure.IntStack;

import java.util.Scanner;

public class RecurX2 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요. :");
        int x = stdIn.nextInt();

        recur(x);
    }
    static void recur(int n) {
        IntStack stack = new IntStack(n);

        while (true) {
            if (n > 0) {
                stack.push(n);
                n = n - 1;
                continue;
            }

            if (stack.isEmpty() != true) {
                n = stack.pop();
                System.out.println(n);
                n = n - 2;
                continue;
            }
            break;
        }
    }
}
