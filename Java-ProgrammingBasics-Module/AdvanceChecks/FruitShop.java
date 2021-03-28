package AdvanceChecks;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String fruitType = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0.0;

        boolean isValid = true;


        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
            if (fruitType.equals("banana")) {
                price = 2.5;
            } else if (fruitType.equals("apple")){
                price = 1.2;
            }else if (fruitType.equals("orange")){
                price = 0.85;
            }else if (fruitType.equals("grapefruit")){
                price = 1.45;
            }else if (fruitType.equals("kiwi")){
                price = 2.7;
            }else if (fruitType.equals("pineapple")){
                price = 5.5;
            }else if (fruitType.equals("grapes")){
                price = 3.85;
            }else {
                isValid= false;


            }
        }else if (dayOfWeek.equals("Saturday")|| dayOfWeek.equals("Sunday")){
            if (fruitType.equals("banana")) {
                price = 2.7;
            } else if (fruitType.equals("apple")){
                price = 1.25;
            }else if (fruitType.equals("orange")){
                price = 0.9;
            }else if (fruitType.equals("grapefruit")){
                price = 1.60;
            }else if (fruitType.equals("kiwi")){
                price = 3;
            }else if (fruitType.equals("pineapple")){
                price = 5.6;
            }else if (fruitType.equals("grapes")){
                price = 4.2;
            }else{
                isValid= false;


            }
        }else {
            isValid= false;



        }

        double total = price * quantity;



        if (!isValid ){
            System.out.println("error");
        }else {
            System.out.printf("%.2f" ,total);
        }


    }
}
