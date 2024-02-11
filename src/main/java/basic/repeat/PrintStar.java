package basic.repeat;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class PrintStar {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("반복회수 입력:");
        int n = stdIn.nextInt();
        log.info("*를 {}개를 출력합니다.", n);

        System.out.print("줄 바꿈 입력:");
        int w = stdIn.nextInt();
        log.info("{}개마다 줄 바꿈", w);



        for (int i = 0; i < n; i++) {
            System.out.print("*");
            if(i % w == w - 1) {
                System.out.println("");
            }
        }

        if (n % w != 0) {
            System.out.println();
        }
    }
}
