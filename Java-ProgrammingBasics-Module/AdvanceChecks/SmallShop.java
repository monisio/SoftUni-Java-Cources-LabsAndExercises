package AdvanceChecks;

import java.util.Scanner;

public class SmallShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String article = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double total = 0.0;


        if (city.equals("Sofia")) {
            if (article.equals("coffee")) {
                total = quantity * 0.50;
            } else if (article.equals("water")) {
                total = quantity * 0.80;
            } else if (article.equals("beer")) {
                total = quantity * 1.2;
            } else if (article.equals("sweets")) {
                total = quantity * 1.45;
            } else if (article.equals("peanuts")) {
                total = quantity * 1.60;
            }

        }

        if (city.equals("Plovdiv")) {
            if (article.equals("coffee")) {
                total = quantity * 0.40;
            } else if (article.equals("water")) {
                total = quantity * 0.70;
            } else if (article.equals("beer")) {
                total = quantity * 1.15;
            } else if (article.equals("sweets")) {
                total = quantity * 1.30;
            } else if (article.equals("peanuts")) {
                total = quantity * 1.50;
            }

        }

        if (city.equals("Varna")) {
            if (article.equals("coffee")) {
                total = quantity * 0.45;
            } else if (article.equals("water")) {
                total = quantity * 0.70;
            } else if (article.equals("beer")) {
                total = quantity * 1.10;
            } else if (article.equals("sweets")) {
                total = quantity * 1.35;
            } else if (article.equals("peanuts")) {
                total = quantity * 1.55;
            }

        }


        System.out.println(total);
    }


}