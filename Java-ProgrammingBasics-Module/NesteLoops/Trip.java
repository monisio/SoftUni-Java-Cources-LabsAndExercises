package NestedCycles;

import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // създаваме два лоопа  единия чете дестинация и бюджет . втория чете сума и изкарва то бюджета.

        String destination = scanner.nextLine();


        while (!destination.equals("End")) {

            double neededMoney = Double.parseDouble(scanner.nextLine());


            while (neededMoney > 0) {
                double sum = Double.parseDouble(scanner.nextLine());

                neededMoney -= sum;


            }


            System.out.printf("Is going to %s!%n", destination);



            destination = scanner.nextLine();
        }


    }
}
