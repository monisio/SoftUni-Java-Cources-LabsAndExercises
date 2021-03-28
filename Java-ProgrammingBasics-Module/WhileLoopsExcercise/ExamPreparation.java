package WhileLoopsExcercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int failAllow = Integer.parseInt(scanner.nextLine());


        int failCount = 0;

        int testCount = 0;


        // може да е инт но долу в изчилеснията резултата трябва да се умножи по 1.0
        double scoreSum = 0;

        String nameTest = "";
        boolean isFailed = true;


        while (failAllow > failCount) {

            String name = scanner.nextLine();
            int score = Integer.parseInt(scanner.nextLine());

            if (name.equals("Enough")) {
                isFailed = false;

                break;
            }


            if (score <= 4) {
                failCount++;
            }
            scoreSum += score;
            testCount++;
            nameTest = name;

            if (failCount >= failAllow) {
                break;
            }


        }

        double average = scoreSum / testCount;

        if (failCount >= failAllow) {
            System.out.printf("You need a break, %d poor grades.", failCount);
        }

        if (!isFailed) {
            System.out.printf("Average score: %.2f%n", average);
            System.out.printf("Number of problems: %d%n", testCount);
            System.out.printf("Last problem: %s", nameTest);

        }
    }
}
