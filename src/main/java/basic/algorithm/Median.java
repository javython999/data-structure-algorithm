package basic.algorithm;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class Median {
    public static void main(String[] args) {
        log.info("중앙값 = {}", med(10, 9, 100,1000));
    }

    static double med(int...values) {
        double median = 0.0;

        Arrays.sort(values);

        // array length 홀수/짝수 확인
        int middleIndex = values.length / 2;

        if (values.length % 2 == 0) {
            median = (values[middleIndex-1] + values[middleIndex]) / 2.0;
        } else {
            median = values[middleIndex];
        }

        return median;
    }
}
