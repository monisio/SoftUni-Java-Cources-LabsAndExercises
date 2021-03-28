package Fundamentals.TextProcessing;

import java.util.Scanner;

public class DigitsLetterAndOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        StringBuilder[] stringArrays = new StringBuilder[3];  // This way array has no elements but have only memory booked.
                                                              // Array is containing null.

        for (int i = 0; i <stringArrays.length ; i++) {
            stringArrays[i]= new StringBuilder();
        }

        for (int i = 0; i < inputLine.length(); i++) {
            char a = inputLine.charAt(i);

            if (Character.isDigit(a)) {

                stringArrays[0].append(a);           // if an array contain null and no objects you cannot append to it.
            } else if (Character.isLetter(a)) {
                stringArrays[1].append(a);
            } else {
                stringArrays[2].append(a);
            }

        }

        for (StringBuilder stringArray : stringArrays) {

            System.out.println(stringArray);
        }


    }


}
