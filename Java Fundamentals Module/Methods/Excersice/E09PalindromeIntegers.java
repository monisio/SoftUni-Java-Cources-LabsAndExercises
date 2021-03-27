package Fundamentals.Methods.Excersice;

import java.util.Scanner;

public class E09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        while (!input.equals("END")){



            System.out.println(getBooleanForNumber(input));



            input = scanner.nextLine();
        }






    }

    private static boolean getBooleanForNumber(String input ) {

        String mirror = "";

        for (int i = input.length()-1; i >=0 ; i--) {
            mirror+=input.charAt(i);

        }

        if (mirror.equals(input)){
            return true;
        }else {
            return false;
        }

    }
}
