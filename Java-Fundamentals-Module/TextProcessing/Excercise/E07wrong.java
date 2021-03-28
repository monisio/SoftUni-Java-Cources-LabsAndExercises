package Fundamentals.TextProcessing.Excercise;

import java.util.Scanner;

public class E07wrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder input = new StringBuilder(scanner.nextLine());

       int firstIndex = input.indexOf(">");
        int lastIndex = input.lastIndexOf(">");

        int power = 0;
        for (int i = firstIndex; i <= lastIndex+1 ; i++) {
            char current = input.charAt(i);
            if (Character.isDigit(current)){
                int powerToAdd = Integer.parseInt(String.valueOf(current));
                power+= powerToAdd;

            }

        }

        for (int i = firstIndex; i < input.length() ; i++) {
            char current= input.charAt(i);

            if (current!= '>' && power>0){
                input.deleteCharAt(i);
               i--;
                power--;
            }

        }


        System.out.println(input);

    }
}