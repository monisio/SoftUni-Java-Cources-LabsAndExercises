package AdvanceChecksExercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());


        double price = 0.0;



        switch (type) {
            case ("Premiere"):
                price = 12;
                break;
            case ("Normal"):
                price = 7.5;
                break;
            case ("Discount"):
                price = 5;
                break;
        }

        Double priceTotal = price * (r * c);

        System.out.printf("%.2f leva", priceTotal);

    }
}
