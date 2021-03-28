package Checks;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double order = (puzzles * 2.60) + (dolls * 3) + (bears * 4.10) + (minions * 8.20) + (trucks * 2);
        //int amountToys = puzzles + dolls + bears + minions + trucks;
        if ((puzzles + dolls + bears + minions + trucks) >= 50) {
            double discountPrice = order - (order * 0.25);
            double profit = discountPrice - (discountPrice * 0.10);
            double total = Math.abs(profit - tripPrice);
            if (profit >= tripPrice) {
                System.out.printf("Yes! " + "%.2f" + " lv left.", total);
            } else {
                System.out.printf("Not enough money! " + "%.2f" + " lv needed.",total);
            }
            // vqrno do tuk no nqma cifri sled desetichna
        } else {
            double profit = order - (order *0.10);
            double difference = Math.abs(profit - tripPrice);
            if (difference > tripPrice){
            System.out.printf( "Yes ! " + "%.2f" + " lv left.", difference);
            } else {
                System.out.printf ("Not enough money! " + "%.2f"  + " lv needed.", difference);

            }

        }


    }
}
