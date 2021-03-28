package JavaFundamentalsCourse.TextProcessing;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String inputWord = scanner.nextLine();


        while (!inputWord.equals("end")) {

            char[] inputAsArray = new char[inputWord.length()];


            for (int i = 0; i < inputWord.length(); i++) {

                inputAsArray[i] = inputWord.charAt(inputAsArray.length - 1 - i);

            }

            String reversed = String.valueOf(inputAsArray);

            System.out.println(inputWord + " = " + reversed);


            inputWord = scanner.nextLine();

        }


    }
}
