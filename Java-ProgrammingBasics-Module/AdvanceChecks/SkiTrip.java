package AdvanceChecks;

import java.util.Scanner;

public class SkiTrip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String score = scanner.nextLine();

        int nights = days - 1;
        double price = 0.0;


        //"room for one person" – 18.00 лв. за нощувка
        //"apartment" – 25.00 лв. за нощувка
        //"president apartment" – 35.00 лв. за нощувка

        if (roomType.equals("room for one person")) {
            price = 18;

        } else if (roomType.equals("apartment")) {
            if (nights < 9) {
                price = 25 - (25 * 0.3);
            } else if (nights >= 10 && nights < 15) {
                price = 25 - (25 * 0.35);
            } else if (nights >= 15) {
                price = 25 - (25 * 0.5);
            }

        } else if (roomType.equals("president apartment")) {
            if (nights < 9) {
                price = 35 - (35 * 0.1);
            } else if (nights >= 10 && nights < 15) {
                price = 35 - (35 * 0.15);
            } else if (nights >= 15) {
                price = 35 - (35 * 0.2);
            }
        }


        double nightsTotal = nights * price;

        double scoredDisc = 0.0;

        if (score.equals("negative")) {
            scoredDisc = nightsTotal - (nightsTotal * 0.1);
        }
        if (score.equals("positive")) {
            scoredDisc = nightsTotal + (nightsTotal * 0.25);
        }

        System.out.printf("%.2f", scoredDisc);


    }
}
