package JavaFundamentalsCourse.TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordToRemove = scanner.nextLine();

        String input = scanner.nextLine();


        List<Character> resultList = new ArrayList<>();

        while (input.contains(wordToRemove)) {
            int startIndex = 0;
            int wordFirstLetterIndex = input.indexOf(wordToRemove, startIndex);

            while (wordFirstLetterIndex != -1) {

                for (int i = startIndex; i < wordFirstLetterIndex; i++) {
                    char character = input.charAt(i);
                    resultList.add(character);

                }

                startIndex = wordFirstLetterIndex + wordToRemove.length();
                wordFirstLetterIndex = input.indexOf(wordToRemove, startIndex);
            }
            char[] chars = input.substring(startIndex).toCharArray();

            for (char entry : chars) {
                resultList.add(entry);
            }

            input = String.valueOf(chars);
        }


        System.out.println(input);


    }
}
