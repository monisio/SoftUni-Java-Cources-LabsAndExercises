package ForCycles;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int lilyYears = Integer.parseInt(scanner.nextLine());
        double priceWasher = Double.parseDouble(scanner.nextLine());
        int toysPrice = Integer.parseInt(scanner.nextLine());


        int oddToys = 0;

        // int brotherTake = even - 1 ;


        for (int i = 1; i <= lilyYears; i++) {

            if (i % 2 == 0) {
                priceWasher -= (i * 5)-1;


            } else {
                oddToys += 1;
            }


        }


        double sumToys = oddToys * toysPrice;

        double total = priceWasher - sumToys ;

        if (total>0) {
            System.out.printf("No! %.2f", total);
        } else {
            System.out.printf("Yes! %.2f", Math.abs(total));
        }


    }
}
