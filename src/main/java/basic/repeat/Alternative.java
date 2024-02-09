package basic.repeat;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class Alternative {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("반복회수 입력:");
        int n = stdIn.nextInt();

        log.info("+와 -를 번갈아 {}개를 출력합니다.", n);

        boolean toggle = true;

        for (int i = 0; i < n; i++) {
            if (toggle) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
            toggle = !toggle;
        }
    }
}
