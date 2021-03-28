package TestPreparation;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double targetSum = Double.parseDouble(scanner.nextLine());

        String command = scanner.nextLine();

        double sum = 0.0;

        boolean isTargetReached = false;

        while (!command.equals("Party!")) {

            int cocktails = Integer.parseInt(scanner.nextLine());

            double cocktailsSum = command.length() * cocktails;

            if (cocktailsSum % 2 != 0) {

                cocktailsSum *= 0.75;
            }

            sum += cocktailsSum;

            if (targetSum <= sum) {
                isTargetReached = true;
                break;
            }


            command = scanner.nextLine();
        }

        if (isTargetReached) {
            System.out.println("Target acquired.");
        } else {
            System.out.printf("We need %.2f leva more.%n", targetSum - sum);

        }

        System.out.printf("Club income - %.2f leva.", sum);

    }
}
