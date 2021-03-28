package JavaProgramingBasicsCourse.AdvanceChecksExercise;

import java.util.Scanner;

public class NewHouse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowersQuantity = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double price = 0.0;

        if (flowerType.equals("Roses")) {
            if (flowersQuantity > 80) {
                price = 5 * 0.9;
            } else {
                price = 5;
            }

        } else if (flowerType.equals("Dahlias")) {
            if (flowersQuantity > 90) {
                price = 3.80 * 0.85;
            } else {
                price = 3.80;
            }
        } else if (flowerType.equals("Tulips")) {
            if (flowersQuantity > 80) {
                price = 2.80 * 0.85;
            } else {
                price = 2.80;
            }


        } else if (flowerType.equals("Narcissus")) {
            if (flowersQuantity < 120) {
                price = 3 * 1.15;
            } else {
                price = 3;
            }

        } else if (flowerType.equals("Gladiolus")) {
            if (flowersQuantity < 80) {
                price = 2.5 * 1.20;
            } else {
                price = 2.5;
            }
        }


        double money = flowersQuantity * price;
        double total = budget - money;


        if (total >= 0) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",flowersQuantity,flowerType,total );

        } else {
            System.out.printf("Not enough money, you need %.2f leva more.",total * -1 );

        }
    }
}
