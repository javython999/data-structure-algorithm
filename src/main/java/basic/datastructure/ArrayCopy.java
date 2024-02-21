package basic.datastructure;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] copy = new int[array.length];

        System.out.println(Arrays.toString(copy));
        copy(array, copy);
        System.out.println(Arrays.toString(copy));
    }

    static void copy(int[] origin, int[] copy) {
        for(int i=0; i<origin.length; i++) {
            copy[i] = origin[i];
        }
    }
}
