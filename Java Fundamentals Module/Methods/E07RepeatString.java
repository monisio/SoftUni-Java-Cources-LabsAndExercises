package Fundamentals.Methods;

import java.util.Scanner;

public class E07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int multiplier= Integer.parseInt(scanner.nextLine());

        String inputMultiplied = multiplyString (input,multiplier);

        System.out.println(inputMultiplied);

    }

    private static String multiplyString(String input, int multiplier) {
       String output="";


        for (int i = 1; i <=multiplier ; i++) {
            output+=input;


        }

        return output;
    }


}
