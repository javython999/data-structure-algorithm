package basic.datastructure;

import java.util.Arrays;

public class ReverseArrayPractice {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("origin array = " + Arrays.toString(array));

        reverse(array);

        System.out.println("reverse array = " + Arrays.toString(array));
    }


    static void reverse(int[] array) {
        for (int i = 0; i<array.length/2; i++) {
            int targetIdx = array.length-1-i;
            System.out.printf("array[%s] <-> array[%s]", i, targetIdx);
            System.out.println();
            swap(array, i, targetIdx);
            System.out.println(Arrays.toString(array));
        }
    }

    static void swap(int[] array, int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}
