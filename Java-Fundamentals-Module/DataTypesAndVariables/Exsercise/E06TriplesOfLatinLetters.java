package Fundamentals.DataTypesAndVariables.Exsercise;

import java.util.Scanner;

public class E06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            char one = (char) ('a' + i);
            for (int j = 0; j < n; j++) {
                char two = (char) ('a' + j);
                for (int k = 0; k < n; k++) {
                    char three = (char) ('a' + k);

                    System.out.printf("%c%c%c%n",one,two,three);

                }
            }
        }




        //Моя вариант - по сложен от този в лекциите.
//        for (int i = 97; i < 97+n; i++) {
//            char a = (char) i;
//            for (int j = 97; j < 97+n; j++) {
//                char b = (char) j;
//                for (int k = 97; k < 97+n; k++) {
//                    char c = (char) k;
//
//                    System.out.printf("%s%s%s%n", a, b, c);
//                }
//            }
//        }

    }
}
