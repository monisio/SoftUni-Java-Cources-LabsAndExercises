package JavaFundamentalsCourse.TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String [] bannedWord = scanner.nextLine().split(", ");
        String inputText = scanner.nextLine();



        for (int i = 0; i < bannedWord.length; i++) {
            String currentWord =  bannedWord[i];
            List<String> repeated = new ArrayList<>();

            for (int j = 0; j < currentWord.length(); j++) {
                repeated.add("*");
            }
            String replacement = String.join("",repeated);

         inputText = inputText.replace(currentWord, replacement);

        }


        System.out.println(inputText);
    }
}
