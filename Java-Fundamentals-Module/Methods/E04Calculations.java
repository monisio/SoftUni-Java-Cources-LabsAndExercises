package Fundamentals.Methods;

import java.util.Scanner;

public class E04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operationType = scanner.nextLine();

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        String symbol = scanner.nextLine();


        switch (operationType) {
            case "divide":
                division(a, b);
                break;
            case "multiply":
                multiplication(a, b);
                break;
            case "add":
                adding(a, b);
                break;

            case "substract":
                subraction(a, b);
                break;
        }


    }

    private static void subraction(int a, int b) {
        System.out.println(a - b);
    }

    private static void adding(int a, int b) {
        System.out.println(a + b);
    }

    private static void multiplication(int a, int b) {
        System.out.println(a * b);
    }

    private static void division(int a, int b) {
        System.out.println(a / b);
    }
}
