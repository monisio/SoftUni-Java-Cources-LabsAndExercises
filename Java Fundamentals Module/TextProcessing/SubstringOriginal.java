package Fundamentals.TextProcessing;

import java.util.Scanner;

public class SubstringOriginal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String word = scanner.nextLine();
        String inputString = scanner.nextLine();


        while (inputString.contains(word)){

           inputString = inputString.replace(word,"");
        }

        System.out.println(inputString);
    }
}
