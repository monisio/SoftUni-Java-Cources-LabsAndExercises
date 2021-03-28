package Fundamentals.Methods;

import java.util.Scanner;

public class E01SignOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String output = checkTheSign(n);

        System.out.println(output);


    }


    static String checkTheSign(int n) {

        if (n < 0) {
            return "The number " + n + " is negative.";
        } else if (n > 0) {
            return "The number " + n + " is postitive.";
        } else {
            return "The number " + n + " is zero.";
        }


    }

}
