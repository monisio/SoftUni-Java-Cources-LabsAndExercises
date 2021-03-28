package Fundamentals.Methods.Excersice;

import java.util.Scanner;

public class E06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        printMiddleCharacters(input);



    }

    private static void printMiddleCharacters(String input) {
        int middleChar = input.length()/2;

        if(input.length() % 2==0){
            char a = input.charAt(middleChar-1);
            char b = input.charAt(middleChar);
            System.out.print(a+""+b);
        }else {
            System.out.println(input.charAt(middleChar));
        }

    }
}
