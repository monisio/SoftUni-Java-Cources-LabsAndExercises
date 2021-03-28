package Fundamentals.TextProcessing.Excercise;

import java.util.Scanner;

public class E06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());

        for (int i = 0; i < input.length(); i++) {

            char current = input.charAt(i);
            int endOfRepeat = i;


            for (int j = endOfRepeat; j < input.length(); j++) {
                char next = input.charAt(j);

                if (current == next) {
                    endOfRepeat = j;
                } else {
                    break;
                }

            }


            if (endOfRepeat != i) {

                input.replace(i, endOfRepeat, "");
            }

        }


        System.out.println(input);
    }
}
