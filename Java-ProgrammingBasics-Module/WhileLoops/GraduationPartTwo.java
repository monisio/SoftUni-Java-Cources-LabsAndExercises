package WhileLoops;

import java.util.Scanner;

public class GraduationPartTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();


        int yearCount = 0;
        double score = 0.0;
        int failCount = 0;

        while (yearCount < 12) {

            double input = Double.parseDouble(scanner.nextLine());


            if (input < 4) {
                failCount += 1;
               // yearCount -= 1;
            }

            if (failCount == 2) {
                System.out.printf("%s has been excluded at %d grade", name, yearCount);
                break;
            }

            yearCount += 1;
            score += input;


        }


        double average = score / yearCount;

        if (yearCount == 12) {

            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }

    }

}
