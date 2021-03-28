package JavaFundamentalsCourse.BasicSyntaxExcercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double sum = 0.0;


        while (!input.equals("Start")) {
            double coinInsert = Double.parseDouble(input);

            if (coinInsert == 0.1 || coinInsert == 0.2 || coinInsert == 0.5 || coinInsert == 1 || coinInsert == 2) {
                sum += coinInsert;
            } else {
                System.out.printf("Cannot accept %.2f%n", coinInsert);
            }


            input = scanner.nextLine();
        }

        input = scanner.nextLine();


        while (!input.equals("End")) {

            boolean isNotEnought = false;

            if (input.equals("Nuts")) {
                if (sum >= 2){
                    sum -= 2.0;
                }else {
                    isNotEnought = true;
                }
            } else if (input.equals("Water")) {
                if (sum>= 0.7){
                    sum -= 0.7;
                }else  {
                    isNotEnought = true;
                }
            } else if (input.equals("Crisps")) {
                if (sum>= 1.5){
                    sum -= 1.5;
                }else {
                    isNotEnought = true;
                }
            } else if (input.equals("Soda")) {
                if (sum>= 0.8){
                    sum -= 0.8;
                }else {
                    isNotEnought = true;
                }
            } else if (input.equals("Coke")) {
                if(sum >= 1){

                    sum -= 1.0;
                }else{
                    isNotEnought = true;
                }
            } else {
                System.out.println("Invalid product");
                input = scanner.nextLine();
                continue;
            }

            if (!isNotEnought) {
                System.out.println("Purchased " + input);

            } else {

                System.out.println("Sorry, not enough money");
            }

            input = scanner.nextLine();
        }


        System.out.printf("Change: %.2f", sum);


    }
}
