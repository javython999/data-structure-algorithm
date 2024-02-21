package basic.datastructure;

import java.util.Arrays;

public class ArrayReverseCopy {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] copy = new int[array.length];

        reverseCopy(array, copy);

        System.out.println(Arrays.toString(copy));
    }

    static void reverseCopy(int[] origin, int[] copy) {
        reverse(origin);
        copy(origin, copy);
    }

    static void reverse(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            swap(array, i, array.length-1-i);
        }
    }

    static void swap(int[] array, int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }

    static void copy(int[] origin, int[] copy) {
        for (int i=0; i<origin.length; i++) {
            copy[i] = origin[i];
        }
    }


}
