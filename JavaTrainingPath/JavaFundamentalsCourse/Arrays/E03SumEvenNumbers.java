package JavaFundamentalsCourse.Arrays;

import java.util.Scanner;

public class E03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

       String [] inputToArray = input.split(" ");


        int [] inputNumbers = new int [inputToArray.length];

        for (int i = 0; i < inputNumbers.length ; i++) {
            inputNumbers [i] = Integer.parseInt(inputToArray[i]);

        }

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < inputNumbers.length; i++) {
             if (inputNumbers[i] % 2==0) {
                 evenSum += inputNumbers[i];

             }else {
                 oddSum += inputNumbers[i];
             }


        }

        System.out.println(evenSum - oddSum);
    }
}
