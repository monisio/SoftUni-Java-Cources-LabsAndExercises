package Fundamentals.Methods;

import java.util.Scanner;

public class E05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();

        int quantity = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f", calculateOrder(product, quantity));

    }

    public static double calculateOrder(String product, int quantity) {

        if (product.equals("coffee")) {

            return 1.5 * quantity;

        } else if (product.equals("coke")) {
            return 1.4 * quantity;

        } else if (product.equals("shacks")) {
            return 2.00 * quantity;
        } else if (product.equals("water")) {
            return 1.00 * quantity;

        } else {
            return 0;
        }

    }
}


        	/*coffee – 1.50
        	water – 1.00
        	coke – 1.40
        	snacks – 2.00
*/