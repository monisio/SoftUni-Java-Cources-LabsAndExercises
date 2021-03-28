package AdvanceChecks;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double s = Double.parseDouble(scanner.nextLine());


        double commision = 0.0;
        boolean isValid = true;


        if (s >= 0 && s <= 500) {
            if (city.equals("Sofia")) {
                commision = 0.05;

            } else if (city.equals("Varna")) {
                commision = 0.045;

            } else if (city.equals("Plovdiv")) {
                commision = 0.055;

            }
        } else if (s > 500 && s <= 1000) {

            if (city.equals("Sofia")) {
                commision = 0.07;

            } else if (city.equals("Varna")) {
                commision = 0.075;

            } else if (city.equals("Plovdiv")) {
                commision = 0.08;
            } else {
                isValid = false;

            }
        } else if (s > 1000 && s <= 10000) {
            if (city.equals("Sofia")) {
                commision = 0.08;

            } else if (city.equals("Varna")) {
                commision = 0.1;

            } else if (city.equals("Plovdiv")) {
                commision = 0.12;
            } else {
                isValid = false;
            }

        } else if (s > 10000) {
            if (city.equals("Sofia")) {
                commision = 0.12;

            } else if (city.equals("Varna")) {
                commision = 0.13;

            } else if (city.equals("Plovdiv")) {
                commision = 0.145;

            } else {
                isValid = false;
            }


        } else {
            isValid = false;
        }

        double comCalculation = s * commision;

        if (!isValid) {
            System.out.println("error");
        }else {
        System.out.printf("%.2f", comCalculation);
        }

    }
}
