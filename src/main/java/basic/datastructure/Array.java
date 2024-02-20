package basic.datastructure;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.NoSuchElementException;

@Slf4j
public class Array {
    public static void main(String[] args) {
        int[] intArray = createIntArray(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int maxValue = maxValueOf(intArray);
        System.out.println("maxValue = " + maxValue);
    }

    static int[] createIntArray(int... values) {
        return Arrays.stream(values).toArray();
    }

    static int maxValueOf(int[] intArray) {
        return Arrays.stream(intArray)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }
}
