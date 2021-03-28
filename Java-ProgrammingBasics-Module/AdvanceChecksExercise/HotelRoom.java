package AdvanceChecksExercise;

import java.util.Scanner;

public class HotelRoom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nightCount = Integer.parseInt(scanner.nextLine());


        double studioPrice = 0.0;
        double apartmentPrice = 0.0;


        if (month.equals("May") || month.equals("October")) {
            studioPrice = 50;
            apartmentPrice = 65;
            if (nightCount > 7 && nightCount < 14) {
                studioPrice *= 0.95;
            } else if (nightCount > 14) {
                studioPrice *= 0.70;
            }

            if (nightCount > 14) {
                apartmentPrice *= 0.90;
            }

        }
        if (month.equals("June") || month.equals("September")) {
            studioPrice = 75.20;
            apartmentPrice = 68.70;
            if (nightCount > 14) {
                studioPrice *= 0.80;
            }

            if (nightCount > 14) {
                apartmentPrice *= 0.90;
            }

        }
        if (month.equals("July") || month.equals("August")) {
            studioPrice = 76;
            apartmentPrice = 77;

            if (nightCount > 14) {
                apartmentPrice *= 0.90;
            }
        }

        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice * nightCount);
        System.out.printf("Studio: %.2f lv.", studioPrice * nightCount);


    }
}
