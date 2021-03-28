package Fundamentals.TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");


        String result = getRepeatString(input);


        System.out.println(result);

    }

    private static String getRepeatString(String[] input) {
        List<String> inputRepeated = new ArrayList<>();

        for (String word : input) {

            for (int i = 0; i < word.length() ; i++) {
                inputRepeated.add(word);
            }


        }


        return String.join("", inputRepeated);
    }
}
