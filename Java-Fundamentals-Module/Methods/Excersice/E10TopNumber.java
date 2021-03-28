package Fundamentals.Methods.Excersice;

import java.util.Scanner;

public class E10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <=n ; i++) {
            boolean isDivideByEight = checkIfDivisibleByEight(i);
            boolean isContainOdd = checkIfContainOdd(i);

            if(isDivideByEight&&isContainOdd){
                System.out.println(i);
            }
        }



    }

    private static boolean checkIfContainOdd(int number) {
        int currentNumber = number;
        boolean isContainOdd = false;
        while (currentNumber>0){

           int singleDigit= currentNumber % 10;

           if (singleDigit%2!=0){
                isContainOdd = true;
                break;
           }

            currentNumber /= 10;
        }

        if (isContainOdd){
            return true;
        }else{
            return false;
        }

    }

    private static boolean checkIfDivisibleByEight(int number) {
        int currentNumber = number;
        int sum = 0;

        while (currentNumber>0){

            sum += currentNumber % 10;

            currentNumber /= 10;
        }

        if(sum % 8==0){
            return true;
        }else{
            return false;
        }

    }
}
