package JavaProgramingBasicsCourse.AdvanceChecksExercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishersAmount = Integer.parseInt(scanner.nextLine());


        double priceBoat = 0.0;

        if (season.equals("Spring")) {
            priceBoat = 3000;
            if (fishersAmount <= 6) {
                priceBoat *= 0.9;
            } else if ( fishersAmount <= 11) {
                priceBoat *= 0.85;
            } else {
                priceBoat *= 0.75;
            }

        } else if (season.equals("Summer")||(season.equals("Autumn"))) {
            priceBoat = 4200;
            if (fishersAmount <= 6) {
                priceBoat *= 0.9;
            } else if ( fishersAmount <= 11) {
                priceBoat *= 0.85;
            } else  {
                priceBoat *= 0.75;
            }



        } else if (season.equals("Winter")) {
            priceBoat = 2600;
            if (fishersAmount <= 6) {
                priceBoat *= 0.9;
            } else if (  fishersAmount <= 11) {
                priceBoat *= 0.85;
            } else  {
                priceBoat *= 0.75;
            }
        }


        if (fishersAmount % 2 == 0 && !season.equals("Autumn")) {
            priceBoat *= 0.95;
        }

        double total = budget - priceBoat;

        if (total >= 0) {
            System.out.printf("Yes! You have %.2f leva left.", budget - priceBoat);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", priceBoat - budget);
        }


    }
}
