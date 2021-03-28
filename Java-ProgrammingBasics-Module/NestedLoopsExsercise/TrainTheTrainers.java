package NestedCyclesExsercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();


        double totalSum = 0.0;
        int counter = 0;

        while (!input.equals("Finish")) {

            String currentTopic = input;

            double sum = 0.0;

            for (int i = 1; i <= n; i++) {
                double score = Double.parseDouble(scanner.nextLine());

                sum += score;
                totalSum += score;
                counter++;

            }


            System.out.printf("%s - %.2f.%n", currentTopic, sum / n);

            input = scanner.nextLine();

        }

        System.out.printf("Student's final assessment is %.2f.", totalSum / counter);


    }
}
