package AdvanceChecksExercise;

import java.util.Scanner;

public class Travelers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        double priceSleep = 0.0;
        String roomType = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                priceSleep = budget * 0.3;
                roomType = "Camp";
            } else if (season.equals("winter")) {
                priceSleep = budget * 0.7;
                roomType = "Hotel";
            }

        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                priceSleep = budget * 0.4;
                roomType = "Camp";
            } else if (season.equals("winter")) {
                priceSleep = budget * 0.8;
                roomType = "Hotel";
            }
        } else if (budget > 1000) {
            destination = "Europe";
            if (season.equals("summer") || season.equals("winter")) {
                priceSleep = budget * 0.9;
                roomType = "Hotel";
            }
        }




        System.out.printf("Somewhere in %s%n",destination);
        System.out.printf("%s - %.2f",roomType,priceSleep);

    }
}
