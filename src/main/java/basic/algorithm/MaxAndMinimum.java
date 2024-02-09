package basic.algorithm;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MaxAndMinimum {

    public static void main(String[] args) {
        log.info("max(1, 4, 9, 10) = {}", max(1,4,9,10));
        log.info("max(6, 2, 8, 100) = {}", max(6,2,8,100));
        log.info("max(7, 5, 3, 1000) = {}", max(7,5,3,1000));
        log.info("-----------------------------------------------");
        log.info("min(1, 4, 9, 10) = {}", min(1,4,9,10));
        log.info("min(6, 2, 8, 100) = {}", min(6,2,8,100));
        log.info("min(7, 5, 3, 1000) = {}", min(7,5,3,1000));
    }


    static int max(int... values) {
        int max = values[0];

        for (int value : values) {
            if (value > max) max = value;
        }

        return max;
    }

    static int min(int... values) {
        int min = values[0];

        for (int value : values) {
            if (value < min) min = value;
        }

        return min;
    }
}
