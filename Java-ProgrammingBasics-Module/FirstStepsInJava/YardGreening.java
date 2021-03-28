package FirstStepsInJava;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sqmeter = Double.parseDouble (scanner.nextLine());
        double sum = sqmeter * 7.61;
        double discount = 0.18 * sum;
        double total = sum - discount;

        System.out.println("Total price is " + total + " Lv.");
        System.out.println("Discount is " + discount + " lv.");





    }
}
