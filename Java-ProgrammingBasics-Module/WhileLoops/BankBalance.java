package WhileLoops;

import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        double balance = 0.0;


        while (!input.equals("NoMoreMoney")) {


            double sumIn = Double.parseDouble(input);


            if (sumIn < 0) {

                System.out.println("Invalid operation!");
                break;

            } else {

                balance += sumIn;
            }

            System.out.printf("Increase: %.2f%n", sumIn);

            input = scanner.nextLine();

        }


        System.out.printf("Total: %.2f", balance);

    }
}
