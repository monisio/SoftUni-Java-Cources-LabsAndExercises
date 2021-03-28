package JavaProgramingBasicsCourse.ForLoopsExercise;

import java.util.Scanner;

public class DivideWithoutRemainder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        double p1Count = 0.0;  // % 2 == 0
        double p2Count = 0.0; // % 3 == 0
        double p3Count = 0.0; // % 4 == 0


        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0) {
                p1Count += 1;
            }

            if (number % 3 == 0) {
                p2Count += 1;
            }

            if (number % 4 == 0) {
                p3Count += 1;
            }


        }


        double p1 = p1Count / n * 100;
        double p2 = p2Count / n * 100;
        double p3 = p3Count / n * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);


    }
}
