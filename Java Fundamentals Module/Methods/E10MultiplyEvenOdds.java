package Fundamentals.Methods;

import java.util.Scanner;

public class E10MultiplyEvenOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int input = Math.abs(Integer.parseInt(scanner.nextLine()));


        System.out.println(getEvenOddMultiplied(input));


    }

    private static int getEvenOddMultiplied(int input) {

        int evenSum = getEvenSum(input);
        int oddSum = getOddSum(input);


        return evenSum * oddSum;


    }

    private static int getOddSum(int input) {
        int number = input;
        int result = 0;


        while (number>0 )  {

            int current = number % 10;

            if (current%2 !=0){
                result+=current;
            }

            number /= 10;

        }

        return result;
    }

    private static int getEvenSum(int input) {
        int number = input;
        int result = 0;


        while (number>0)  {

            int current = number % 10;

             if (current%2==0){
                 result+=current;
             }

            number /= 10;

        }

        return result;
    }

}
