package Fundamentals.TextProcessing.Excercise;

import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split("\\s+");

        double sumTotal = 0.0;
        for (int i = 0; i < input.length; i++) {

            String current = input[i];
            int lastIndex = current.length() - 1;
            char left = current.charAt(0);
            char right = current.charAt(lastIndex);
           double number =Double.parseDouble (current.substring(1, lastIndex));



            double result = 0.0;
            // check if its ascii characted - to be tested.
            // operation should be done and add to result left , then after result left should be combined with result right.
            if (Character.isUpperCase(left)) {
                int num = left-64;

                result = number / num ;  //this cause problem if int multiplied by 1, there is double in input number cases

            } else {
                result = number * (left - 96);
            }


            if (Character.isUpperCase(right)) {
                result -= (right - 64);
            } else {
                result += (right - 96);
            }


            sumTotal += result;
        }


        System.out.println(String.format("%.2f", sumTotal));
    }


}
