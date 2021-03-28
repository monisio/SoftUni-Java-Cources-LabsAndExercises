package Fundamentals.Arrays;

import java.util.Scanner;

public class E04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String [] inputArray = input.split(" ") ;

        for (int i = 0; i < inputArray.length / 2 ; i++) {

            String tempPlace = inputArray[i] ;
            inputArray [i] = inputArray [inputArray.length - (1+i)];
            inputArray [inputArray.length-(1+i)] = tempPlace;


        }

        for (int i = 0; i < inputArray.length ; i++) {
            System.out.print(inputArray[i]+" ");
        }





    }
}
