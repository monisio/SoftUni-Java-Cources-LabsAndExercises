package FirstStepsInJavaExercise1;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananasKg = Double.parseDouble(scanner.nextLine());
        double orangeKg = Double.parseDouble(scanner.nextLine());
        double raspberryKg = Double.parseDouble(scanner.nextLine());
        double strawberryKg = Double.parseDouble(scanner.nextLine());

        double raspberryPrice = strawberryPrice - (strawberryPrice * 0.5);
        double orangePrice = raspberryPrice - (raspberryPrice * 0.4);
        double bananaPrice = raspberryPrice - (raspberryPrice * 0.8);
//      Вариант 1
//        double strawberryTotal = strawberryPrice * strawberryKg;
//        double raspberryTotal = raspberryPrice * raspberryKg;
//        double orangeTotal = orangePrice * orangeKg;
//        double bananaTotal = bananaPrice * bananasKg;
        //      double total = strawberryTotal + raspberryTotal + orangeTotal + bananaTotal;
        double total = strawberryPrice * strawberryKg + raspberryPrice * raspberryKg + orangePrice * orangeKg + bananaPrice * bananasKg;


        System.out.printf("%.2f", total);

    }

}

