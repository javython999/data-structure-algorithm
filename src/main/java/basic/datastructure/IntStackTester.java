package basic.datastructure;

import java.util.Scanner;

public class IntStackTester {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntStack stack = new IntStack(64);

        while (true) {
            System.out.println();
            System.out.printf("현재 데이터 개수: %d / %d\n", stack.size(), stack.getCapacity());
            System.out.print("(1)push    (2)pop    (3)peek    (4)dump    (0)exit : ");

            int menu = stdIn.nextInt();
            if (menu == 0) break;

            int x;

            switch (menu) {
                case 1:
                    System.out.println("데이터 :");
                    x = stdIn.nextInt();

                    try {
                        stack.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2:
                    try {
                        x = stack.pop();
                        System.out.println("pop 데이터: " + x);
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;

                case 3:
                    try {
                        x = stack.peek();
                        System.out.println("peek 데이터: " + x);
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;

                case 4:
                    stack.dump();
                    break;
            }
        }
    }
}
