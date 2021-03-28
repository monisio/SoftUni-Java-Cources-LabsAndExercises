package ForCyclesExercise;

import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double p1Count = 0;    // < 200
        double p2Count = 0;   // 200 … 399
        double p3Count = 0;   // 400 … 599
        double p4Count = 0;   // 600 … 799
        double p5Count = 0;  //  ≥ 800


        for (int i = 1; i <= n; i++) {

            int number = Integer.parseInt(scanner.nextLine());


            if (number < 200) {
                p1Count += 1;
            } else if ( number <= 399 ) {
                p2Count += 1;
            } else if (number <= 599) {
                p3Count += 1;
            } else if (number <=799) {
                p4Count += 1;
            } else {
                p5Count += 1;
            }


        }

        double p1 = p1Count / n * 100;
        double p2 = p2Count / n * 100;
        double p3 = p3Count / n * 100;
        double p4 = p4Count / n * 100;
        double p5 = p5Count / n * 100;

        System.out.printf("%.2f%%%n",p1);
        System.out.printf("%.2f%%%n",p2);
        System.out.printf("%.2f%%%n",p3);
        System.out.printf("%.2f%%%n",p4);
        System.out.printf("%.2f%%",p5);

    }
}
