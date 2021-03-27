package Fundamentals.BasicSyntaxExcercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int inputdigit = Integer.parseInt(input);

        int lenght = input.length();


        int factorialSum = 0;


        for (int i = 0; i < lenght; i++) {


            int digit = Integer.parseInt(String.valueOf(input.charAt(i)));


            int sum = 1;

            for (int j = 1; j <= digit; j++) {

                sum *=j;



            }

            factorialSum +=sum;

        }


        if (factorialSum == inputdigit) {
            System.out.println("yes");

        } else {
            System.out.println("no");
        }

    }
}
