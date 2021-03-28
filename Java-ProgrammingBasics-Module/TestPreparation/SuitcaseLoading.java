package TestPreparation;

import java.util.Scanner;

public class SuitcaseLoading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());

        String command = scanner.nextLine();

        int counter = 0;
        boolean isFull = false;
        int totalSuit = 0;

        while (!command.equals("End")) {
            double suitCase = Double.parseDouble(command);
            counter++;


            if (counter == 3) {
                suitCase *= 1.1;
                counter = 0;
            }

            capacity = capacity - suitCase;

            if (capacity <= 0) {
                isFull = true;
                break;


            }
            totalSuit++;
            command = scanner.nextLine();


        }

        if (isFull) {
            System.out.println("No more space!");
        } else {
            System.out.println("Congratulations! All suitcases are loaded!");

        }

        System.out.printf("Statistic: %d suitcases loaded.", totalSuit);

    }
}
