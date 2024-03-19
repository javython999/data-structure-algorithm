package basic.algorithm;

import java.util.Scanner;

public class FactorialEx {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");

        int x = stdIn.nextInt();
        System.out.println(x + "의 factorial은 " + factorial(x) + "입니다.");
    }

    static int factorial(int x) {

        int returnValue = x;

        while (x > 1) {
            returnValue *= --x;
        }

        return returnValue;
    }
}
