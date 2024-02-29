package basic.datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class PhysicalExamination {

    static final int VMAX = 21;

    static class PhyscData {
        String name;
        int height;
        double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    static double avgHeight(PhyscData[] data) {
        return Arrays.stream(data)
                .mapToDouble(PhyscData -> PhyscData.height)
                .average()
                .orElse(0);
    }

    static void distVision(PhyscData[] data, int[] dist) {
        int i = 0;
        dist[i] = 0;

        for (i = 0;  i < data.length; i++) {
            if (data[i].vision >= 0.0 && data[i].vision <= VMAX / 10.0)
                dist[(int)(data[i]).vision * 10]++;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        PhyscData[] data = {
          new PhyscData("김길동", 170, 0.3),
          new PhyscData("이길동", 173, 0.5),
          new PhyscData("박길동", 175, 0.8),
          new PhyscData("오길동", 177, 1.0),
          new PhyscData("정길동", 180, 1.2),
          new PhyscData("임길동", 183, 1.3),
          new PhyscData("강길동", 186, 1.5),
        };

        int[] vdist = new int[VMAX];

        System.out.println("* 신체 검사 리스트 *");
        System.out.println("이름          키           시력");
        System.out.println("-----------------------------");

        for (PhyscData pData : data) {
            System.out.printf("%s--------%d----------%.1f\n", pData.name, pData.height, pData.vision);
        }

        System.out.printf("\n평균 키 : %5.1fcm\n", avgHeight(data));

        distVision(data, vdist);

        System.out.println("\n시력 분포\n");

        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f~: %2d명\n", i / 10.0, vdist[i]);
        }
    }
}
