package JavaFundamentalsCourse.TextProcessing.Excercise;

import java.util.Scanner;

public class E04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder input =new StringBuilder(scanner.nextLine());

        for (int i = 0; i <input.length() ; i++) {
          char newChar =(char) ( input.charAt(i) + 3) ;

          input.setCharAt(i, newChar);

        }


        System.out.println(input);
    }
}
